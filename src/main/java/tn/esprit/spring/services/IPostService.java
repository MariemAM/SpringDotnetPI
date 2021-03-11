package tn.esprit.spring.services;
import java.util.List;
import tn.esprit.spring.entities.Post;
public interface IPostService {
	List<Post> retrieveAllPost();

	Post addPost(Post p);

	Post updatePost(Post p);

	Post retrieveParents(int postId);

	void deletePost(String postId);
}