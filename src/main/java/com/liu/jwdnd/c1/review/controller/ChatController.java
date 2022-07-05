package com.liu.jwdnd.c1.review.controller;

import com.liu.jwdnd.c1.review.model.ChatForm;
import com.liu.jwdnd.c1.review.service.MessageService;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller

@RequestMapping("/chat")
public class ChatController {
    private MessageService messageService;

    public ChatController(MessageService messageService){
        this.messageService = messageService;
    }

    @GetMapping
    public String getChatPage(@ModelAttribute("chatForm") ChatForm chatForm, Model model){
        model.addAttribute("chatMessages", this.messageService.getChatMessages());
        return "chat";
    }

    @PostMapping
    public String postChatMessage(Authentication authentication, ChatForm chatForm, Model model){
        if(!verifyMessage(chatForm.getMessageText())){
            chatForm.setUsername(authentication.getName());
            this.messageService.addMessage(chatForm);
        }
        chatForm.setMessageText("");
        model.addAttribute("chatMessages", this.messageService.getChatMessages());
        return "chat";
    }

    @ModelAttribute("allMessageTypes")
    public String[] allMessageTypes(){
        return new String[] {"Say", "Shout", "Whisper"};
    }

    public boolean verifyMessage(String message){
        return getBannedWords().stream().anyMatch(message::contains);
    }
    public List<String> getBannedWords(){
        return Arrays.asList("fuck", "fk", "shit");
    }

}
