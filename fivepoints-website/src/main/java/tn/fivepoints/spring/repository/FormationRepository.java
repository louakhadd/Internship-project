package tn.fivepoints.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.fivepoints.spring.entities.Training;

@Repository
public interface FormationRepository extends CrudRepository<Training,Integer> {

}
