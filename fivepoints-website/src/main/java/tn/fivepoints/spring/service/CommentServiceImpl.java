package tn.fivepoints.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.fivepoints.spring.entities.Blog;
import tn.fivepoints.spring.entities.Comment;
import tn.fivepoints.spring.entities.CommentReply;
import tn.fivepoints.spring.repository.BlogRepository;
import tn.fivepoints.spring.repository.CommentReplyRepository;
import tn.fivepoints.spring.repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

	public static final Logger L = LogManager.getLogger(CommentServiceImpl.class);
	
	@Autowired
	CommentRepository CommentRepository;
	@Autowired
	CommentReplyRepository CommentReplyRepository;
	@Autowired
	BlogRepository blogRepository;
	@Autowired
	BlogService bs;

	@Override
	public Comment addComment(Comment Comment) {
		// TODO Auto-generated method stub
		return CommentRepository.save(Comment);
	}

	@Override
	public Comment updateComment(Comment Comment) {
		// TODO Auto-generated method stub
		return CommentRepository.save(Comment);
	}

	@Override
	public void deleteComment(int id) {
		// TODO Auto-generated method stub
		CommentRepository.delete(CommentRepository.findById(id).get());		
	}

	
	@Override
	public List<Comment> showAll() {
		// TODO Auto-generated method stub
		List<Comment> t=(List<Comment>)CommentRepository.findAll();
	
		
		return t;
	}

	@Override
	public List<Comment> getCommentByBlog(int id) {
		// TODO Auto-generated method stub
	
			Blog b = bs.getBlogById(id);
			
			List<Comment> comm = new ArrayList<>();
			
			List<Comment> comments = (List<Comment>) CommentRepository.findAll();

			for (Comment c : comments) {
			
				if(c.getBlog().getId() == b.getId())
				{
					comm.add(c);
				}
				
			}			
			return comm;	
			
			
			
	}
	
	@Override
	public int nbrComments(){
		int i=0;
		for( Comment c : CommentRepository.findAll())
		{
			i++;
		}
		System.out.println("nbr comments:"+ i);
		return i;
	}
	
	@Override
	public List<CommentReply> getReplyByComment(int id) {
		// TODO Auto-generated method stub
	
		Comment b = CommentRepository.findById(id).get();
			
			List<CommentReply> comm = new ArrayList<>();
			
			List<CommentReply> comments = (List<CommentReply>) CommentReplyRepository.findAll();

			for (CommentReply c : comments) {
			
				if(c.getComm().getId() == b.getId())
				{
					comm.add(c);
				}
				
			}			
			return comm;	
			
			
			
	}
	

}

	
