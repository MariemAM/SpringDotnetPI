package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Message;
import tn.esprit.spring.entities.MessagePk;



@Repository
public interface MessageRepository extends CrudRepository<Message, MessagePk>{

	@Query("SELECT m FROM Message m")
	List<Message> getAllMessages();
}
