package tn.fivepoints.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.fivepoints.spring.entities.ServiceRegistration;
import tn.fivepoints.spring.repository.ServiceRegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService{

	@Autowired
	ServiceRegistrationRepository ServiceRegistrationRepository;
	
	@Override
	public ServiceRegistration register(ServiceRegistration registration) {
		// TODO Auto-generated method stub
		return ServiceRegistrationRepository.save(registration);
	}

	@Override
	public List<ServiceRegistration> showAllregistrations() {
		// TODO Auto-generated method stub
		List <ServiceRegistration> reg = (List<ServiceRegistration>) ServiceRegistrationRepository.findAll();
		return reg;
	}

	@Override
	public ServiceRegistration getRegistrationById(int id) {
		// TODO Auto-generated method stub
		return ServiceRegistrationRepository.findById(id).get();
	}

}
