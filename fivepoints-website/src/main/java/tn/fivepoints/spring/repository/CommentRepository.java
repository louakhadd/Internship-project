package tn.fivepoints.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.fivepoints.spring.entities.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Integer> {

}
