package com.websocket.wsdemo.dto;

public class MessageDto {
    private String messageContent;

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public MessageDto(String messageContent) {
        this.messageContent = messageContent;
    }

    public MessageDto() {
    }

    @Override
    public String toString() {
        return "MessageDto [messageContent=" + messageContent + "]";
    }

}
