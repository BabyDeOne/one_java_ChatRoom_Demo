package com.liu.jwdnd.c1.review.model;

public class ChatForm {

    private String username;
    private String messageText;
    private String messageType;

    // constructors of username
    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    //constructors of messageText
    public String getMessageText(){
        return messageText;
    }

    public void setMessageText(String messageText){
        this.messageText = messageText;
    }

    //constructors of messageType
    public String getMessageType(){
        return messageType;
    }

    public void setMessageType(String messageType){
        this.messageType = messageType;
    }
}
