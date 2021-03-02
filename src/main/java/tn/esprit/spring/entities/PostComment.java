package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "postComment")
public class PostComment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PostCommentPk commentpk;
	private String text;
	private Date creationDate;

	@ManyToOne
	@JoinColumn(name = "idPost", referencedColumnName = "id", insertable = false, updatable = false)
	private Post post;
	@ManyToOne
	@JoinColumn(name = "idParent", referencedColumnName = "id", insertable = false, updatable = false)
	private Parent parent;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
