package tn.esprit.ControllerRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.entities.ActivityComment;
import tn.esprit.service.ActivityComment_Service;
@RestController
@RequestMapping("/ActivityComment")
public class ActivityCommentRestController {
	@Autowired
	ActivityComment_Service actcomserv;
	
	@PostMapping("/AddactivityComment")
	public void addActivityComment(@RequestBody ActivityComment act){
		actcomserv.addActivityComment(act);
	}
	@GetMapping("/retrieveAllActivityComment")
	public List<ActivityComment> retrieveAllActivityComment(){
		return actcomserv.retrieveAllActivityComment();
	}
	@DeleteMapping("/deleteActivityComment")
	public void deleteActivityComment(@RequestBody ActivityComment actcom){
		actcomserv.deleteActivityComment(actcom);
	}
	@DeleteMapping("/deleteActivity/{id}")
	public void deleteActivityCommentByid(@PathVariable("idact")Long idact)
	{
		actcomserv.deleteActivityCommentById(idact);
	}
	@PutMapping("/updateActivityComment")
	public void updateActivityComment(@RequestBody ActivityComment act){
		actcomserv.updateActivityComment(act);
	}
	
	
}


