package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ParticipationFK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idKid;
	private int idEvent;
	public int getIdKid() {
		return idKid;
	}
	public void setIdKid(int idKid) {
		this.idKid = idKid;
	}
	public int getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}
	

}
