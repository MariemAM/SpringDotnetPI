package tn.esprit.spring.services;
import java.util.List;
import tn.esprit.spring.entities.Parent;
public interface IParentService {
	List<Parent> retrieveAllParent(); 
	Parent addParents(Parent p); 
	 void deleteParents(String id); 
	 Parent updateParents(Parent p); 
	 Parent retrieveParents(int id);
}
