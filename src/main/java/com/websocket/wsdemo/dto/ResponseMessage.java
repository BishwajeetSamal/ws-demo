package com.websocket.wsdemo.dto;

public class ResponseMessage {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ResponseMessage(String content) {
        this.content = content;
    }

    public ResponseMessage() {
    }

    @Override
    public String toString() {
        return "ResponseMessage [content=" + content + "]";
    }

}
