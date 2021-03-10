package tn.esprit.spring.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.*;
import tn.esprit.spring.repository.*;

@Service
public class RelationServiceImp implements IRelationService {

	    @Autowired 
	    MeetingRelationRepository meetingrepo;
	    @Autowired 
	    ComplaintRelationRepository complaintrepo;
	    
	    @Override
	    public List<Meeting> listMeeting() {
			// TODO Auto-generated method stub
			return (List<Meeting>) meetingrepo.findAll();
		}	    
	    
		@Override
		public Meeting addMeeting(Meeting meeting) {
			// TODO Auto-generated method stub
			return meetingrepo.save(meeting);
		}
		
		@Override
		public void deleteMeetingById(int id) {
			// TODO Auto-generated method stub
			meetingrepo.deleteById(id);
		}
		@Override
		public Meeting findMeetingById(int id) {
			// TODO Auto-generated method stub
			return meetingrepo.findById(id).orElse(null);
		}

		
		public List<Complaint> listComplaint() {
			// TODO Auto-generated method stub
			return (List<Complaint>) complaintrepo.findAll();
		}
	
		public Complaint addOrUpdateComplaint(Complaint complaint) {
			// TODO Auto-generated method stub
			return complaintrepo.save(complaint);
		}
		
//		public Meeting UpdateMeeting(int id,String text,String object,String pvi,Date creationD,Date meetingD) {
//			// TODO Auto-generated method stub
//           Meeting meetingToUpdate=meetingrepo.getOne(id);
//           meetingToUpdate.setCreationdate(creationD);
//           meetingToUpdate.setText(text);
//           meetingToUpdate.setPvi(pvi);
//           meetingToUpdate.setMeetingDate(meetingD);
//           meetingToUpdate.setObject(object);
//           meetingrepo.save(meetingToUpdate);           
//			return meetingToUpdate;
//		}
		
}

