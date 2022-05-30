package com.websocket.wsdemo.controller;

import com.websocket.wsdemo.dto.MessageDto;
import com.websocket.wsdemo.dto.ResponseMessage;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {
    @MessageMapping("/message") // receiving messages
    @SendTo("/topic/messages") // sending it back to the specified endpoint
    public ResponseMessage getMessage(final MessageDto message) throws InterruptedException {
        Thread.sleep(1000);
        return new ResponseMessage(HtmlUtils.htmlEscape(message.getMessageContent()));
    }
}
