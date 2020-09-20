package tn.fivepoints.spring.service;

import java.util.List;

import tn.fivepoints.spring.entities.Partenaires;

public interface PartenaireService {
	Partenaires addpartner(Partenaires par);
	Partenaires updatepartner(Partenaires par);
	void deletepartners(int id);
	List<Partenaires> showAllpartners();
	
}
	
