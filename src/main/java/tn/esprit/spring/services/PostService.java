package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Post;
import tn.esprit.spring.repository.PostRepository;

@Service
public class PostService implements IPostService{
@Autowired
 PostRepository postrepo;

@Override
public List<Post> retrieveAllPost() {
	List<Post> post = (List<Post>) postrepo.findAll();
	for(Post ac : post)
	{
	}
	return post;
}

@Override
public Post addPost(Post p) {
	return postrepo.save(p);
}

@Override
public void deletePost(String postId) {
	postrepo.deleteById(Integer.parseInt(postId));
	// TODO Auto-generated method stub
	
}

@Override
public Post updatePost(Post p) {
	// TODO Auto-generated method stub
	return this.postrepo.save(p);
}

@Override
public Post retrieveParents(int postId) {
	// TODO Auto-generated method stub
	return this.postrepo.findById(postId).get();
}
	
}
