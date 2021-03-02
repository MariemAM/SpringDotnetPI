package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private MessagePk messagepk;

	private Date creationDate;
	private String object;

	@ManyToOne
	@JoinColumn(name = "idParent1", referencedColumnName = "id", insertable = false, updatable = false)
	private Parent parent1;
	@ManyToOne
	@JoinColumn(name = "idParent2", referencedColumnName = "id", insertable = false, updatable = false)
	private Parent parent2;

	public MessagePk getMessagepk() {
		return messagepk;
	}

	public void setMessagepk(MessagePk messagepk) {
		this.messagepk = messagepk;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

}
