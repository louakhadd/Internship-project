package tn.fivepoints.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.fivepoints.spring.entities.ServiceRegistration;
import tn.fivepoints.spring.service.RegistrationService;

@RestController
public class ServicesRegistrationRestController {
	
	@Autowired
	RegistrationService registrationService;
	
	
	// localhost:8081/ServiceRegistration
	 @PostMapping("/ServiceRegistration") 
	 @ResponseBody 
	 public ServiceRegistration Register(@RequestBody ServiceRegistration t) { 
		 ServiceRegistration tt = registrationService.register(t);	
		 return tt; 
		 }
	 
	 
	//http://localhost:8081/ServiceRegistration
	 @GetMapping(value = "/ServiceRegistration")
	 @ResponseBody
	 public List<ServiceRegistration> showRegistrations() {
		 return registrationService.showAllregistrations();
	}
	 

}
