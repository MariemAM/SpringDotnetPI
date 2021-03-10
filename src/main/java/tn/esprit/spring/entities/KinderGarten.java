package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class KinderGarten implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private int phoneNumber;
	private Date InscriptionDate;
	private int nbrEmployee;

	@OneToMany(mappedBy = "KG")
	private Set<Activity> activities;

	@OneToMany(mappedBy = "KG")
	private Set<Event> events;

	@OneToMany(mappedBy = "KG")
	private Set<InscriptionKid> inscriptionKids;

	@OneToMany(mappedBy = "KG")
	private Set<User> users;

	public KinderGarten() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KinderGarten(String name, String description, int phoneNumber, Date inscriptionDate, int nbrEmployee) {
		super();
		this.name = name;
		this.description = description;
		this.phoneNumber = phoneNumber;
		InscriptionDate = inscriptionDate;
		this.nbrEmployee = nbrEmployee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getInscriptionDate() {
		return InscriptionDate;
	}

	public void setInscriptionDate(Date inscriptionDate) {
		InscriptionDate = inscriptionDate;
	}

	public int getNbrEmployee() {
		return nbrEmployee;
	}

	public void setNbrEmployee(int nbrEmployee) {
		this.nbrEmployee = nbrEmployee;
	}

	public Set<Activity> getActivities() {
		return activities;
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}
	

}
