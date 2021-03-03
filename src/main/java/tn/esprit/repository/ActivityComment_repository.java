package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.ActivityComment;
@Repository

public interface ActivityComment_repository extends CrudRepository<ActivityComment,Long> {

}
