/**
 * 
 */
package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Activity;

/**
 * @author Asus
 *
 */
@Repository
public interface Activity_repository  extends CrudRepository<Activity,Long>{

}
