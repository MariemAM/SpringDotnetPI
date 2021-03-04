package tn.esprit.service;

import java.util.List;

import tn.esprit.entities.Activity;

public interface Activity_Service {

	public void addActivity(Activity act);
	public void updateActivity(Activity act);
	public void deleteActivity(Activity act);
	public void deleteActivityById(Long id);
	Activity  retrieveActivityById(Long id);
	List<Activity> retrieveAllActivity();
	
	
	
}
