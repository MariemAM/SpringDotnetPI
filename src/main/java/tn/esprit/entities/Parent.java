package tn.esprit.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Parent extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
