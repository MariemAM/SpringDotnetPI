package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String sender;
	private int idParent1;
	private int idParent2;
	private Date creationDate;
	private String object;
	@Enumerated(EnumType.STRING)
	private MessageType type;

	public enum MessageType {
		CHAT, LEAVE, JOIN
	}

	@ManyToOne
	@JoinColumn(name = "idParent1", referencedColumnName = "id", insertable = false, updatable = false)
	private Parent parent1;
	@ManyToOne
	@JoinColumn(name = "idParent2", referencedColumnName = "id", insertable = false, updatable = false)
	private Parent parent2;

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdParent1() {
		return idParent1;
	}

	public void setIdParent1(int idParent1) {
		this.idParent1 = idParent1;
	}

	public int getIdParent2() {
		return idParent2;
	}

	public void setIdParent2(int idParent2) {
		this.idParent2 = idParent2;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
