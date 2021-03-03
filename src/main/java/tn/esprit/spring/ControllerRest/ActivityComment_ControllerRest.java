package tn.esprit.spring.ControllerRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.service.ActivityComment_Service;
import tn.esprit.spring.entities.ActivityComment;

@RestController
@RequestMapping("/")
@Component
public class ActivityComment_ControllerRest {

	@Autowired
	ActivityComment_Service  activitycommentservice;
	
	
	
	@GetMapping("/retrieve_AllActivityComment")
	public List<ActivityComment> retrieveAllActivityComment()
	{
	return	activitycommentservice.retrieveAllActivityComment();
	}
	
	@GetMapping("/retrieve_ActivityCommentById/{idactcpom}")
	public ActivityComment RetrieveActivityCommentById(@PathVariable("idactcpom") Long id)
	{
		return activitycommentservice.retrieveActivityCommentById(id);
	}
	@PostMapping("/add_activitycomment")
	public void addactivitycomment(@RequestBody ActivityComment actcom )
	{
		activitycommentservice.addActivityComment(actcom);
	}
	@DeleteMapping("/deleteactivitycomment")
	public void deleteactivitycomment(@RequestBody ActivityComment actcom)
	{
		activitycommentservice.deleteActivityComment(actcom);
	}
	@DeleteMapping("/deleteactivitycommentbyid/{idactcpom}")
	public void deleteactivitycommentByid(@PathVariable("idactcpom") Long id)
	{
		activitycommentservice.deleteActivityCommentById(id);
	}
	@PutMapping("/updateactivitycomment")
	public void updateactivitycomment(@RequestBody ActivityComment actcom)
	{
		activitycommentservice.updateActivityComment(actcom);
	}

	
}
