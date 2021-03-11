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

import tn.esprit.spring.entities.Parent;
import tn.esprit.spring.entities.Post;
import tn.esprit.spring.services.IPostService;
public class PostRest {
	 
	@Autowired
	IPostService PostService;
	// http://localhost:8001/SpringMVC/serv/retrieve-all-Posts 
		 @GetMapping("/retrieve-all-Posts") 
		 @ResponseBody 
		 public List<Post> getActivity() {
			return null; 
			  } 
		// Ajouter Post : http://localhost:8001/SpringMVC/serv/add-Post 
				 @PostMapping("/add-Post") 
				 @ResponseBody 
				 public Post addPost(@RequestBody Post p) { 
					 Post posts = PostService.addPost(p);
					 return posts ;
					  }
					//http://localhost:8001/SpringMVC/serv/remove-Post/{Post-id} 
				 @DeleteMapping("/remove-Post/{Post-id}") 
				 @ResponseBody 
				 public void removePost(@PathVariable("Post-id") String PostId) {
					 PostService.deleteParents(PostId);
					  } 
				// http://localhost:8001/SpringMVC/serv/modify-Post 
				 @PutMapping("/modify-Post") 
				 @ResponseBody 
				 public Post modifyActivity(@RequestBody Post p) { 
					 return PostService.updatePost(p);  
					 }
				//http://localhost:8001/SpringMVC/serv/retrieve-Post/{Post-id} 
				 @GetMapping("/retrieve-Post/{Post-id}") 
				 @ResponseBody 
				 public Post retrievePost(@PathVariable("Post-id") int PostId) { 
					 return PostService.retrieveParents(PostId);  } 
			
}
