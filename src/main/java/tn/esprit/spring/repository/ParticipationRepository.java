package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.Participation;
import tn.esprit.spring.entities.ParticipationFK;

@Repository
public interface ParticipationRepository extends JpaRepository<Participation, ParticipationFK>{
	
	@Transactional
	@Modifying
	@Query(value="insert into participation (id_event, id_kid) VALUES (:idEvent, :idKid)",nativeQuery=true)
	public void participate(@Param("idEvent") Integer idEvent, @Param("idKid") Integer idKid);

}
