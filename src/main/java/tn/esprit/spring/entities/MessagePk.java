package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class MessagePk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idParent1;
	private int idParent2;
	private Date creationDate;
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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + idParent1;
		result = prime * result + idParent2;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MessagePk other = (MessagePk) obj;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (idParent1 != other.idParent1)
			return false;
		if (idParent2 != other.idParent2)
			return false;
		return true;
	}



}
