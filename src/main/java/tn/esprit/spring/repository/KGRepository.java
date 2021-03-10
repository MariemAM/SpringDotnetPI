package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.KinderGarten;

@Repository
public interface KGRepository extends CrudRepository<KinderGarten, Integer>{

}
