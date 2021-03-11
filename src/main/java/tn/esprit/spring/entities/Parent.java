package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;

@Entity
public class Parent extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@org.springframework.data.annotation.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private boolean delegate;
	@OneToMany(mappedBy = "parent")
	private Set<InscriptionKid> inscriptionKids;

	@OneToMany(mappedBy = "parent")
	private Set<Post> posts;

	@OneToMany(mappedBy = "parent")
	private Set<PostComment> comments;

	@OneToMany(mappedBy = "parent1")
	private Set<Message> messages;

	@OneToMany(mappedBy = "parent2")
	private Set<Message> messagess;

	public boolean isDelegate() {
		return delegate;
	}

	public void setDelegate(boolean delegate) {
		this.delegate = delegate;
	}

}
