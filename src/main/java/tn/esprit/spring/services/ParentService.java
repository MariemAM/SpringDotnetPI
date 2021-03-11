package tn.esprit.spring.services;
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Parent;
import tn.esprit.spring.repository.ParentRepository;

	@Service
	public class ParentService  implements IParentService{
		@Autowired
		ParentRepository parentRepo;
		@Override
		public List<Parent> retrieveAllParent() {

			List<Parent> parents = (List<Parent>) parentRepo.findAll();
			for(Parent ac : parents)
			{
			}
			return parents;
			// TODO Auto-generated method stub
		}
		
		
		@Override
		public Parent addParents(Parent p) {
			return parentRepo.save(p);
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteParents(String id) {
			parentRepo.deleteById(Integer.parseInt(id));
			// TODO Auto-generated method stub
		}
		
		@Override
		public Parent updateParents(Parent p) {
			return this.parentRepo.save(p);
			// TODO Auto-generated method stub	
		}
		
		@Override
		public Parent retrieveParents(int id) {
			return this.parentRepo.findById(id).get();
			// TODO Auto-generated method stub	
		}
				
	}