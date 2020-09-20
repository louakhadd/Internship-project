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

import tn.fivepoints.spring.config.JsonResponse;
import tn.fivepoints.spring.entities.Training;
import tn.fivepoints.spring.entities.TrainingRegistration;
import tn.fivepoints.spring.service.FormationService;
import tn.fivepoints.spring.service.TrainingRegistrationService;



@RestController
public class TrainingRestController {
	
	 @Autowired 
	 FormationService trainingService;
	 
	 @Autowired
	 TrainingRegistrationService trs;
	 
	    //http://localhost:8081/Trainings/3
	    @GetMapping(value = "Trainings/{id}")
	    @ResponseBody
		public Training getTrainingById(@PathVariable("id") int Id) {

			return trainingService.getTrainingById(Id);
		}

	 
	// localhost:8081/Trainings
		//GET
	   // @CrossOrigin(origins = "http://localhost:4200")
	 @GetMapping("/Trainings") 
	 @ResponseBody 
	 public List<Training> getTrainings() {
		 List<Training> list = trainingService.showAll();
		 return list; } 
	 
 	  
		// localhost:8081/Trainings
	 @PostMapping("/Trainings") 
	 @ResponseBody 
	 public Training addWishList(@RequestBody Training t) { 
		 Training user = trainingService.addTraining(t);	
		 return user; 
		 }
	 
	 
	// localhost:8081/remove-training/{training-id} 
		//DELETE
	 
	 @DeleteMapping("/Trainings/{training-id}") 
	 @ResponseBody 
	 public void removeWishList(
			 @PathVariable("training-id") int id) { 
		 trainingService.deleteTraining(id);
	 	}
	 
	// localhost:8081/Trainings/1  
		//PUT
	 @PutMapping("/Trainings")
	 @ResponseBody 
	 public Training modifyWishList(@RequestBody Training training) { 
		 return trainingService.updateTraining(training);
	 }
	 
 	 				 
	 @GetMapping("/Trainings/intro/{id}") 
	 @ResponseBody
	 ResponseEntity<?> getIntroBlogs(@PathVariable("id") int id) {
		
		 String s = trainingService.introDescription(id);
		 
		 JsonResponse jr = new JsonResponse(s);
		 
		 return ResponseEntity.ok(jr);
	 }
	 
		// localhost:8081/TrainingRegistration
	 @PostMapping("/TrainingRegistration") 
	 @ResponseBody 
	 public TrainingRegistration Register(@RequestBody TrainingRegistration t) { 
		 TrainingRegistration tt = trs.register(t);	
		 return tt; 
		 }
		 
	 
	//http://localhost:8081/Trainings/like/3
	    @GetMapping(value = "Trainings/like/{id}")
	    @ResponseBody
		public void Like(@PathVariable("id") int Id) {

			trainingService.like(Id);
		}
	 
				 
}

