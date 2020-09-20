package tn.fivepoints.spring.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import tn.fivepoints.spring.entities.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact,Integer> {

}
