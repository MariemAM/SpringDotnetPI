package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.repository.Activity_repository;
import tn.esprit.spring.entities.Activity;
@Service
public class Activity_Service_Impl implements Activity_Service  {

	@Autowired
	Activity_repository act_rep;
	
	
	@Override
	public void addActivity(Activity act) {
		// TODO Auto-generated method stub
		act_rep.save(act);
	}

	@Override
	public void updateActivity(Activity act) {
		// TODO Auto-generated method stub
		act_rep.save(act);
	}

	@Override
	public void deleteActivity(Activity act) {
		// TODO Auto-generated method stub
		act_rep.delete(act);
	}

	@Override
	public void deleteActivityById(Long id) {
		// TODO Auto-generated method stub
		act_rep.deleteById(id);
	}

	@Override
	public Activity retrieveActivityById(Long id) {
		// TODO Auto-generated method stub
		return act_rep.findById(id).get();
	}

	@Override
	public List<Activity> retrieveAllActivity() {
		// TODO Auto-generated method stub
		return (List<Activity>)act_rep.findAll();
	}

	
	
	
}
