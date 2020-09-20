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

import tn.fivepoints.spring.entities.User;
import tn.fivepoints.spring.service.UserService;



@RestController
public class UserRestController {
	
	 @Autowired 
	 UserService userService;
	
	/////////////////////// WishList//////////////////////////////////
	 
	    //http://localhost:8081/SpringMVC/servlet/Users/3
	    @GetMapping(value = "Users/{id}")
	    @ResponseBody
		public User getUserById(@PathVariable("id") int Id) {

			return userService.getUserById(Id);
		}

	 
	// localhost:8081/SpringMVC/servlet/Users
		//GET
	   // @CrossOrigin(origins = "http://localhost:4200")
	 @GetMapping("/Users") 
	 @ResponseBody 
	 public List<User> getUsers() {
		 List<User> list = userService.showAllUsers();
		 return list; } 
	 
 	  
		// localhost:8081/SpringMVC/servlet/Users
	 @PostMapping("/Users") 
	 @ResponseBody 
	 public User addWishList(@RequestBody User t) { 
		 User user = userService.addUser(t);	
		 return user; 
		 }
	 
	 
	// localhost:8081/SpringMVC/servlet/remove-user/{user-id} 
		//DELETE
	 
	 @DeleteMapping("/Users/{user-id}") 
	 @ResponseBody 
	 public void removeWishList(
			 @PathVariable("user-id") int id) { 
		 userService.deleteUser(id);
	 	}
	 
	
 	 				 
		
		 
				 
}

