package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.InscriptionKid;
@Repository
public interface KidRepository extends CrudRepository<InscriptionKid, Integer>{

}
