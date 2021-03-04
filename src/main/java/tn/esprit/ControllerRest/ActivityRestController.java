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

import tn.esprit.entities.Activity;
import tn.esprit.service.Activity_Service;

@RestController
@RequestMapping("/activity")
public class ActivityRestController {
@Autowired 

Activity_Service actserv;
	
	

@PostMapping("/addactivty")
public void addactivity(@RequestBody Activity act)
{
	actserv.addActivity(act);
}
@GetMapping("/retrieveAllActivity")
public List<Activity> retrieveAllActivity()
{
	return actserv.retrieveAllActivity();
}
@DeleteMapping("/deleteActivity")
public void deleteActivity(@RequestBody Activity act)
{
	actserv.deleteActivity(act);
}

@DeleteMapping("/deleteActivity/{id}")
public void deleteActivitybyid(@PathVariable("id") Long idact)
{
	actserv.deleteActivityById(idact);
}
@PutMapping("/updateactivity")
public void updateactivity(@RequestBody Activity act)
{
	actserv.updateActivity(act);
}
 
}
