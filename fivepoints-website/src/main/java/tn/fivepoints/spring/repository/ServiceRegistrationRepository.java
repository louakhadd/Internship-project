package tn.fivepoints.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.fivepoints.spring.entities.ServiceRegistration;

@Repository
public interface ServiceRegistrationRepository extends CrudRepository<ServiceRegistration,Integer> {

}
