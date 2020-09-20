package tn.fivepoints.spring.service;

import java.util.List;

import tn.fivepoints.spring.entities.Comment;
import tn.fivepoints.spring.entities.CommentReply;

public interface CommentService {
	Comment addComment(Comment comment);
	Comment updateComment(Comment comment);
	void deleteComment(int id);
	List<Comment> showAll();
	List<Comment> getCommentByBlog(int id);
	int nbrComments();
	List<CommentReply> getReplyByComment(int id);
}
