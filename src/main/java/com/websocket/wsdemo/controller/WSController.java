package com.websocket.wsdemo.controller;

import com.websocket.wsdemo.dto.MessageDto;
import com.websocket.wsdemo.service.WSService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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

    @PostMapping("/send-private-message/{id}")
    public void sendPrivateMessage(@PathVariable final String id, @RequestBody final MessageDto message) {
        System.out.println("sending private messages");
        wsService.notifyUserFrontend(id, message.getMessageContent());
    }
}
