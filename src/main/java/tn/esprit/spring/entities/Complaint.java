package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("complaint")
public class Complaint extends Relation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String typrOfComplent;

	public String getTyprOfComplent() {
		return typrOfComplent;
	}

	public void setTyprOfComplent(String typrOfComplent) {
		this.typrOfComplent = typrOfComplent;
	}
}
