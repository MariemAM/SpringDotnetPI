package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.spring.entities.*;

public interface SatisfactionRelationRepository extends JpaRepository<Satisfaction, Integer> {

}
