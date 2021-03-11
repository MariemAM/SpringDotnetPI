package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

//	@Query("SELECT e FROM Event u WHERE u.KG= :kg")
//	List<Event> retrieveEventsByKG(@Param("kg") KinderGarten KG);  

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Modifying
	@Query(value = "update event e set kg_id = :ref where e.id = :eventId ", nativeQuery = true)
	void affectEventToKG(@Param("ref") int ref, @Param("eventId") int eventId);
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Modifying
	@Query(value = "update event e set kg_id = NULL where e.id = :eventId and kg_id =:ref ", nativeQuery = true)
	void desaffectEventToKG(@Param("ref") int ref, @Param("eventId") int eventId);
	
    
}
