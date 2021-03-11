package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;
import tn.esprit.spring.entities.Message;
//import tn.esprit.spring.entities.MessagePk;
import tn.esprit.spring.service.IMessageService;

@Controller
public class ChatController {
	@Autowired
	IMessageService msgsr;

	@MessageMapping("/chat.register")
	@SendTo("/topic/public")
	public Message register(@Payload Message chatMessage, SimpMessageHeaderAccessor headerAccessor) {
//		MessagePk messagepk = new MessagePk();
//		messagepk.setIdParent1(1);
//		messagepk.setIdParent2(2);
//		chatMessage.setMessagepk(messagepk);
		headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
		return chatMessage;
	}

	@MessageMapping("/chat.send")
	@SendTo("/topic/public")
	public Message sendMessage(@Payload Message chatMessage) {
		msgsr.addMessage(chatMessage);
		return chatMessage;
	}

}
