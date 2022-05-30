package com.websocket.wsdemo.controller;

import com.websocket.wsdemo.dto.MessageDto;
import com.websocket.wsdemo.service.WSService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WSController {
    @Autowired
    WSService wsService;

    @PostMapping("/send-message")
    public void sendMessage(@RequestBody final MessageDto message) {
        System.out.println(message);
        wsService.notifyFrontend(message.getMessageContent());
    }
}
