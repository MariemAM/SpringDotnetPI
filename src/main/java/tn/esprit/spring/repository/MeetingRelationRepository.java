package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.entities.Meeting;

public interface MeetingRelationRepository extends JpaRepository<Meeting, Integer>{

}