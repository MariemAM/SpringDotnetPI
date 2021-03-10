package tn.esprit.spring.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Complaint;
import tn.esprit.spring.entities.Meeting;
import tn.esprit.spring.service.RelationServiceImp;

@RestController
@RequestMapping(path = "/meeting")
public class RelationRestController {
	
//	 String clientId="FFt5_vtaSa6_nhxSmVJFZg";
//	 String clientSecret="u27dOAvegbm3nVFHNgASxBT9JQrx68AX";

	@Autowired
	RelationServiceImp relationservice;
	
	

	@GetMapping("/getall")
	public List<Meeting> list() {
		List<Meeting> list = relationservice.listMeeting();
		return list;
	}

	@PostMapping("/add")
	public Meeting addOrUpdateMeeting(@RequestBody Meeting m) {
		return relationservice.addMeeting(m);
	}
	
	@GetMapping("/get/{meeting-id}")
	public Meeting retrieveEvent(@PathVariable("meeting-id") int meetingId) {
		return relationservice.findMeetingById(meetingId);
	}
	@DeleteMapping("/remove/{meeting-id}")
	public void removeMeetinng(@PathVariable("meeting-id") int meetingId) {
		relationservice.deleteMeetingById(meetingId);
	}

	@GetMapping("/getallComplaint")
	public List<Complaint> list2() {
		List<Complaint> list = relationservice.listComplaint();
		return list;
	}
	
	

}
