package tn.fivepoints.spring.service;

import java.util.List;

import tn.fivepoints.spring.entities.Training;

public interface FormationService {
	Training addTraining(Training training);
	Training updateTraining(Training training);
	void deleteTraining(int id);
	List<Training> showAll();
	Training getTrainingById(int id);
	String introDescription(int id);
	void like(int id);
}
