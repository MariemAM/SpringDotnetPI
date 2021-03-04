package tn.esprit.service;

import java.util.List;

import tn.esprit.entities.ActivityComment;

public interface ActivityComment_Service {
	public void addActivityComment(ActivityComment act);
	public void updateActivityComment(ActivityComment act);
	public void deleteActivityComment(ActivityComment act);
	public void deleteActivityCommentById(Long id);
	ActivityComment  retrieveActivityCommentById(Long id);
	List<ActivityComment> retrieveAllActivityComment();
	
}
