package tn.fivepoints.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.fivepoints.spring.entities.Comment;
import tn.fivepoints.spring.entities.CommentReply;
import tn.fivepoints.spring.service.CommentService;



@RestController
public class CommentRestController {
	
	 @Autowired 
	 CommentService commentService;
	
	/////////////////////// WishList//////////////////////////////////
	 
	    //http://localhost:8081/Comments/3
	    @GetMapping(value = "Comments/{id}")
	    @ResponseBody
		public List<Comment> getCommentsByBlog(@PathVariable("id") int id) {

			return commentService.getCommentByBlog(id);
		}

	 
	// localhost:8081/Comments
		//GET
	 @GetMapping("/Comments") 
	 @ResponseBody 
	 public List<Comment> getComments() {
		 List<Comment> list = commentService.showAll();
		 return list;
		 } 
	 
 	  
		// localhost:8081/Comments
	 @PostMapping("/Comments") 
	 @ResponseBody 
	 public Comment addComment(@RequestBody Comment t) { 
		 Comment user = commentService.addComment(t);
		 return user; 
		 }
	 
	 
	// localhost:8081/SpringMVC/servlet/remove-Comment/{Comment-id} 
		//DELETE
	 
	 @DeleteMapping("/Comments/{Comment-id}") 
	 @ResponseBody 
	 public void removeComment(
			 @PathVariable("Comment-id") int id) { 
		 commentService.deleteComment(id);
	 	}
	 
	// localhost:8081/SpringMVC/servlet/Comments/1  
		//PUT
	 @PutMapping("/Comments")
	 @ResponseBody 
	 public Comment modifyComment(@RequestBody Comment comment) { 
		 return commentService.updateComment(comment);
	 }
	 
	//http://localhost:8081/Comments/3
	    @GetMapping(value = "Comments/reply/{id}")
	    @ResponseBody
		public List<CommentReply> getReplyByComment(@PathVariable("id") int id) {

			return commentService.getReplyByComment(id);
		}
	 


 	 				 
		
		 
				 
}

