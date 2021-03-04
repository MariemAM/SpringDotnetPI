package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ActivityComment")
public class ActivityComment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CommentPk commentpk;
	private String content;
	private Date creationDate;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idActivity", nullable = false, insertable = false, updatable = false)
	private Activity activity;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idUser",nullable = false, insertable = false, updatable = false)
	private User user;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
