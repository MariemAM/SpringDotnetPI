package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Participation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private ParticipationFK participatefk;
		
	@ManyToOne
	@JoinColumn(name = "idEvent", referencedColumnName = "id", insertable = false, updatable = false)
	private Event event;
	@ManyToOne
	@JoinColumn(name = "idKid", referencedColumnName = "id", insertable = false, updatable = false)
	private InscriptionKid kid;
	
	public ParticipationFK getParticipatefk() {
		return participatefk;
	}
	public void setParticipatefk(ParticipationFK participatefk) {
		this.participatefk = participatefk;
	}
	

}
