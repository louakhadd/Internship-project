package tn.fivepoints.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.fivepoints.spring.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
