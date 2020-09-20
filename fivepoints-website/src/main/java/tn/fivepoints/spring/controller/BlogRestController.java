package tn.fivepoints.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.fivepoints.spring.entities.Blog;
import tn.fivepoints.spring.service.BlogService;
import tn.fivepoints.spring.config.JsonResponse;


@RestController
public class BlogRestController {
	
	 @Autowired 
	 BlogService blogService;
	
	
	 
	    //http://localhost:8081/SpringMVC/servlet/Blogs/3
	    @GetMapping(value = "Blogs/{id}")
	    @ResponseBody
		public Blog getBlogById(@PathVariable("id") int Id) {

			return blogService.getBlogById(Id);
		}

	 
	// localhost:8081/SpringMVC/servlet/Blogs
		//GET
	   // @CrossOrigin(origins = "http://localhost:4200")
	 @GetMapping("/Blogs") 
	 @ResponseBody 
	 public List<Blog> getBlogs() {
		 List<Blog> list = blogService.showAll();
		 return list; } 
	 
 	  
		// localhost:8081/SpringMVC/servlet/Blogs
	 @PostMapping("/Blogs") 
	 @ResponseBody 
	 public Blog addWishList(@RequestBody Blog t) { 
		 Blog user = blogService.addBlog(t);	
		 return user; 
		 }
	 
	 
	// localhost:8081/SpringMVC/servlet/remove-blog/{blog-id} 
		//DELETE
	 
	 @DeleteMapping("/Blogs/{blog-id}") 
	 @ResponseBody 
	 public void removeWishList(
			 @PathVariable("blog-id") int id) { 
		 blogService.deleteBlog(id);
	 	}
	 
	// localhost:8081/SpringMVC/servlet/Blogs/1  
		//PUT
	 @PutMapping("/Blogs")
	 @ResponseBody 
	 public Blog modifyWishList(@RequestBody Blog blog) { 
		 return blogService.updateBlog(blog);
	 }
	 
		//GET
	 @GetMapping("/Blogs/latest") 
	 @ResponseBody 
	 public List<Blog> getLatestBlogs() {
		 List<Blog> list = blogService.LatestBlogs();
		 return list; } 
	 
	 
	 //Using ResponseEntity to Manipulate the HTTP Response
		//GET
	 @GetMapping("/Blogs/intro/{id}") 
	 @ResponseBody
	 ResponseEntity<?> getIntroBlogs(@PathVariable("id") int id) {
		
		 String s = blogService.introBlog(id);
		 
		 JsonResponse jr = new JsonResponse(s);
		 
		 return ResponseEntity.ok(jr);
	 } 
	 
		//GET
	 @GetMapping("/Blogs/recent") 
	 @ResponseBody 
	 public List<Blog> getLatestArticles() {
		 List<Blog> list = blogService.LatestArticles();
		 return list; } 
	
 	 				 
		
		 
				 
}

