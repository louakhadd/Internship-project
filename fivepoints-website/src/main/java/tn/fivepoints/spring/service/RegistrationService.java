package tn.fivepoints.spring.service;

import java.util.List;

import tn.fivepoints.spring.entities.ServiceRegistration;

public interface RegistrationService {
	ServiceRegistration register(ServiceRegistration registration);
	List<ServiceRegistration> showAllregistrations();
	ServiceRegistration getRegistrationById(int id);
}
