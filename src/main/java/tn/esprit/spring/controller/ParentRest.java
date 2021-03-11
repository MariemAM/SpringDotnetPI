package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Parent;
import tn.esprit.spring.services.IParentService;

@RestController
public class ParentRest {
	@Autowired 
	 IParentService ParentService; 
	
	 // http://localhost:8001/SpringMVC/serv/retrieve-all-Parents 
	 @GetMapping("/retrieve-all-Parents") 
	 @ResponseBody 
	 public List<Parent> getActivity() { 
		 List<Parent> list = ParentService.retrieveAllParent(); 
		 return list; } 
	 
	 
		//http://localhost:8001/SpringMVC/serv/retrieve-Parent/{Parent-id} 
		 @GetMapping("/retrieve-Parent/{Parent-id}") 
		 @ResponseBody 
		 public Parent retrieveParent(@PathVariable("Parent-id") int ParentId) { 
			 return ParentService.retrieveParents(ParentId);  } 
		 
		 
		// Ajouter Parent : http://localhost:8001/SpringMVC/serv/add-Parent 
		 @PostMapping("/add-Parent") 
		 @ResponseBody 
		 public Parent addParent(@RequestBody Parent p) { 
			 Parent parents = ParentService.addParents(p); 
			 return parents ; }
	
	
		//http://localhost:8001/SpringMVC/serv/remove-Parent/{Parent-id} 
		 @DeleteMapping("/remove-Parent/{Parent-id}") 
		 @ResponseBody 
		 public void removeParent(@PathVariable("Parent-id") String ParentId) {
			 ParentService.deleteParents(ParentId);
			  } 
	
		 
		 // http://localhost:8001/SpringMVC/serv/modify-Parent 
		 @PutMapping("/modify-Parent") 
		 @ResponseBody 
		 public Parent modifyActivity(@RequestBody Parent p) { 
			 return ParentService.updateParents(p);  
			 }
		 
}