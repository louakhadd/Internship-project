package tn.fivepoints.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.fivepoints.spring.entities.TrainingRegistration;
import tn.fivepoints.spring.repository.TrainingRegistrationRepository;

@Service
public class TrainingRegistrationServiceImpl implements TrainingRegistrationService{

	@Autowired
	TrainingRegistrationRepository trainingRegistrationRepository;
	
	@Override
	public TrainingRegistration register(TrainingRegistration registration) {
		// TODO Auto-generated method stub
		return trainingRegistrationRepository.save(registration);
	}

	@Override
	public List<TrainingRegistration> showAllregistrations() {
		// TODO Auto-generated method stub
		List <TrainingRegistration> reg = (List<TrainingRegistration>) trainingRegistrationRepository.findAll();
		return reg;
	}

	@Override
	public TrainingRegistration getRegistrationById(int id) {
		// TODO Auto-generated method stub
		return trainingRegistrationRepository.findById(id).get();
	}

}
