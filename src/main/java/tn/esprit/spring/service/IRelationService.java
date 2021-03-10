package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Meeting;

public interface IRelationService {

	public Meeting addMeeting(Meeting meeting);

	public List<Meeting> listMeeting();

	public void deleteMeetingById(int id);

	public Meeting findMeetingById(int id);

}
