package tn.fivepoints.spring.service;

import java.util.List;

import tn.fivepoints.spring.entities.TrainingRegistration;

public interface TrainingRegistrationService {
	TrainingRegistration register(TrainingRegistration registration);
	List<TrainingRegistration> showAllregistrations();
	TrainingRegistration getRegistrationById(int id);
}
