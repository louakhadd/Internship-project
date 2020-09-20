package tn.fivepoints.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.fivepoints.spring.entities.Partenaires;
import tn.fivepoints.spring.repository.PartenaireRepository;

@Service
public class PartenaireServiceImpl implements PartenaireService{
	
	@Autowired
	PartenaireRepository partenaireRepository;

	@Override
	public Partenaires addpartner(Partenaires par) {
		// TODO Auto-generated method stub
		return partenaireRepository.save(par);
	}
	
	public Partenaires updatepartner(Partenaires par) {
		// TODO Auto-generated method stub
		return partenaireRepository.save(par);
	}

	@Override
	public void deletepartners(int id) {
		// TODO Auto-generated method stub
		partenaireRepository.delete(partenaireRepository.findById(id).get());
	}

	@Override
	public List<Partenaires> showAllpartners() {
		// TODO Auto-generated method stub
		List<Partenaires> par= (List<Partenaires>) partenaireRepository.findAll();
		return par;
	}

}
