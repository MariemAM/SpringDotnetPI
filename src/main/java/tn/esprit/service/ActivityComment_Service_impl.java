package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.ActivityComment_repository;
import tn.esprit.spring.entities.ActivityComment;
@Service
public class ActivityComment_Service_impl implements ActivityComment_Service {
@Autowired 
	
ActivityComment_repository actcom_rep;
	@Override
	public void addActivityComment(ActivityComment act) {
		// TODO Auto-generated method stub
		actcom_rep.save(act);
	}

	@Override
	public void updateActivityComment(ActivityComment act) {
		// TODO Auto-generated method stub
		actcom_rep.save(act);
	}

	@Override
	public void deleteActivityComment(ActivityComment act) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteActivityCommentById(Long id) {
		// TODO Auto-generated method stub
		actcom_rep.deleteById(id);
	}

	@Override
	public ActivityComment retrieveActivityCommentById(Long id) {
		// TODO Auto-generated method stub
		return actcom_rep.findById(id).get();
	}

	@Override
	public List<ActivityComment> retrieveAllActivityComment() {
		// TODO Auto-generated method stub
		return (List<ActivityComment>) actcom_rep.findAll();
	}

}
