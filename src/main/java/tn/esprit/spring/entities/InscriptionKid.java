package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class InscriptionKid implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String kidName;
	private Date birthDate;

	@OneToMany(mappedBy = "kid")
	private List<Participation> participations; 
	
	@ManyToOne
	private KinderGarten KG;

	@ManyToOne
	private Parent parent;

	@OneToMany(mappedBy = "inscriptionKid")
	private Set<Relation> relations;

	public InscriptionKid() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InscriptionKid(String kidName, Date birthDate) {
		super();
		this.kidName = kidName;
		this.birthDate = birthDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKidName() {
		return kidName;
	}

	public void setKidName(String kidName) {
		this.kidName = kidName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
