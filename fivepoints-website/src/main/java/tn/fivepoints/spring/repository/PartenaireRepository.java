package tn.fivepoints.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.fivepoints.spring.entities.Partenaires;

@Repository
public interface PartenaireRepository extends CrudRepository<Partenaires,Integer> {

}
