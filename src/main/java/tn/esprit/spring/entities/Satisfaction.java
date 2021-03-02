package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Satisfaction extends Relation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int rate;

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}
