package com.websocket.wsdemo.service;

import com.websocket.wsdemo.dto.ResponseMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class WSService {
    private SimpMessagingTemplate messagingTemplate;

    @Autowired
    public WSService(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public void notifyFrontend(final String message) {
        ResponseMessage resp = new ResponseMessage(message);
        messagingTemplate.convertAndSend("/topic/messages", resp);
    }

    public void notifyUserFrontend(final String id, final String message) {
        ResponseMessage resp = new ResponseMessage(message);
        messagingTemplate.convertAndSendToUser(id, "/topic/private-messages", resp);
    }
}
