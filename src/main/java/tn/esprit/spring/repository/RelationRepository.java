package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import tn.esprit.spring.entities.Relation;

@NoRepositoryBean
public interface RelationRepository<T extends Relation> extends JpaRepository<T, Integer>{
	
//	    @Query("from meeting")
//	    List<Meeting> findAllMeeting();

}
