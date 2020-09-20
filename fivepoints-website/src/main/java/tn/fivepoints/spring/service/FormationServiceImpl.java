package tn.fivepoints.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import tn.fivepoints.spring.entities.Blog;
import tn.fivepoints.spring.entities.Training;
import tn.fivepoints.spring.repository.FormationRepository;

@Service
public class FormationServiceImpl implements FormationService {

	public static final Logger L = LogManager.getLogger(FormationServiceImpl.class);
	
	@Autowired
	FormationRepository formationRepository;

	@Override
	public Training addTraining(Training training) {
		// TODO Auto-generated method stub
		return formationRepository.save(training);
	}

	@Override
	public Training updateTraining(Training training) {
		// TODO Auto-generated method stub
		return formationRepository.save(training);
	}

	@Override
	public void deleteTraining(int id) {
		// TODO Auto-generated method stub
		formationRepository.delete(formationRepository.findById(id).get());		
	}

	
	@Override
	public List<Training> showAll() {
		// TODO Auto-generated method stub
		List<Training> t=(List<Training>)formationRepository.findAll();
		for(Training tr : t)
		{
			L.info("whishlist +++"+ tr);
		}
		
		return t;
	}

	@Override
	public Training getTrainingById(int id) {
		// TODO Auto-generated method stub
		return formationRepository.findById(id).get();	
	}
	
		
	@Override
	public String introDescription(int id) {
		// TODO Auto-generated method stub
		Training t = formationRepository.findById(id).get();
		String intro= t.getDescription().substring(0,110) + "...";
		return intro;
	}
	
	@Override
	public void like (int id){
		
		Training t = formationRepository.findById(id).get();		
		int l = t.getNblike()+1;	
		
		t.setNblike(l);
		formationRepository.save(t);
		//return l;
	
	}

}

	
