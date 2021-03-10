package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.entities.*;

public interface ComplaintRelationRepository extends JpaRepository<Complaint, Integer> {

}
