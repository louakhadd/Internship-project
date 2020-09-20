package tn.fivepoints.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.fivepoints.spring.entities.TrainingRegistration;

@Repository
public interface TrainingRegistrationRepository extends CrudRepository<TrainingRegistration,Integer> {

}
