package com.liu.jwdnd.c1.review.service;

import com.liu.jwdnd.c1.review.mapper.MessageMapper;
import com.liu.jwdnd.c1.review.model.ChatForm;
import com.liu.jwdnd.c1.review.model.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    private MessageMapper messageMapper;

    public MessageService(MessageMapper messageMapper){
        this.messageMapper = messageMapper;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Creating MessageService bean");
    }

    public void addMessage(ChatForm chatForm){
        ChatMessage newMessage = new ChatMessage();
        newMessage.setUsername(chatForm.getUsername());
        switch (chatForm.getMessageType()) {
            case "Say" -> newMessage.setMessage(chatForm.getMessageText());
            case "Shout" -> newMessage.setMessage(chatForm.getMessageText().toUpperCase());
            case "Whisper" -> newMessage.setMessage(chatForm.getMessageText().toLowerCase());
        }
        messageMapper.addMessage(newMessage);
    }

    public List<ChatMessage> getChatMessages(){

        return messageMapper.getAllMessages();
    }
}
