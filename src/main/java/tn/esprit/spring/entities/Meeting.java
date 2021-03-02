package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Meeting extends Relation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date meetingDate;

	public Date getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}

}
