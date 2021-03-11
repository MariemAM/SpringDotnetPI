package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Message;
import tn.esprit.spring.entities.MessagePk;
import tn.esprit.spring.repository.MessageRepository;

@Service
public class MessageService implements IMessageService {

	@Autowired
	MessageRepository messageRepo;

	@Override
	public void addMessage(Message message) {
		messageRepo.save(message);
	}

	@Override
	public List<Message> getMessages() {
		return messageRepo.getAllMessages();
	}

	@Override
	public void deleteMessage(int id, int id2) {
		MessagePk mpk = new MessagePk();
		mpk.setIdParent1(id);
		mpk.setIdParent2(id2);
		Message m = messageRepo.findById(mpk).get();
		messageRepo.delete(m);
	}

}
