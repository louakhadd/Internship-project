package tn.fivepoints.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.fivepoints.spring.entities.CommentReply;

@Repository
public interface CommentReplyRepository extends CrudRepository<CommentReply,Integer> {

}
