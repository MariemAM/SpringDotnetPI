package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Message;

public interface IMessageService {
	void addMessage(Message message);

	void deleteMessage(int id, int id2);

	List<Message> getMessages();

}
