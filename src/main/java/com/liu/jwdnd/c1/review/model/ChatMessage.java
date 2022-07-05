package com.liu.jwdnd.c1.review.model;

public class ChatMessage {
    private String username;
    private String messageText;

    private Integer messageId;


    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getMessage(){
        return messageText;
    }

    public void setMessage(String message){
        this.messageText = message;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

}

