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

import tn.fivepoints.spring.entities.Contact;
import tn.fivepoints.spring.entities.Training;
import tn.fivepoints.spring.service.ContactService;

@RestController
public class ContactRestController {
	
	@Autowired
	ContactService contactService;
	
	//http:8081/SpringMvc/servlet/Contact/1
	@GetMapping(value="/Contact/{id}")
	@ResponseBody
	public Contact getMessageById(@PathVariable("id") int id){
		return contactService.getMessageById(id);
	}
	
	// localhost:8081/SpringMVC/servlet/Contact	
	@GetMapping(value ="/Contact")
	@ResponseBody
	public List<Contact> getMessages(){
		List<Contact> list = contactService.showAllMessages();
		 return list; } 	
	
	// localhost:8081/SpringMVC/servlet/Contact	
	@PostMapping(value= "/Contact")
	@ResponseBody
	public Contact sendMessage(@RequestBody Contact contact){
		System.out.println("aaaa"+contact);
		return contactService.addMessage(contact);
	}
	
	// localhost:8081/SpringMVC/servlet/deleteMessage/{id} 
	@DeleteMapping(value="/Contact/{id}")
	@ResponseBody
	public void deleteMessage(@PathVariable("id") int id){
		contactService.deleteMessage(id);
	}
	
	// localhost:8081/SpringMVC/servlet/Contact	
		@PutMapping(value= "/Contact")
		@ResponseBody
		public Contact updateMessage(@RequestBody Contact contact){
			return contactService.updateMessage(contact);
		}
		
	
}
