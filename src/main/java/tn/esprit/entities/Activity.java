package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Activity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String object;
	private String type;
	private Date creationDate;

	@ManyToOne
	private KinderGarten KG;

	@OneToMany(mappedBy = "activity")
	private Set<ActivityComment> comments;

	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Activity(String object, String type, Date creationDate) {
		super();
		this.object = object;
		this.type = type;
		this.creationDate = creationDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public KinderGarten getKG() {
		return KG;
	}

	public void setKG(KinderGarten kG) {
		KG = kG;
	}

}
