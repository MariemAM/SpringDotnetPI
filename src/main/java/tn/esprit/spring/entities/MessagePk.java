package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class MessagePk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idParent1;
	private int idParent2;

	public int getIdParent1() {
		return idParent1;
	}

	public void setIdParent1(int idParent1) {
		this.idParent1 = idParent1;
	}

	public int getIdParent2() {
		return idParent2;
	}

	public void setIdParent2(int idParent2) {
		this.idParent2 = idParent2;
	}

}
