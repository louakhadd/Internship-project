package tn.fivepoints.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class TrainingRegistration implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	private String firstname;
	private String lastname;
	private String numTel;
	private String email;
	private boolean diplome; 
	private boolean online;
	private boolean resterInforme;	

	@ManyToOne	
	Training training;
	
	
	/*		Getters and Setters 		*/
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isResterInforme() {
		return resterInforme;
	}
	public void setResterInforme(boolean resterInforme) {
		this.resterInforme = resterInforme;
	}
	public Training getTraining() {
		return training;
	}
	public void setTraining(Training training) {
		this.training = training;
	}
	public boolean isDiplome() {
		return diplome;
	}
	public void setDiplome(boolean diplome) {
		this.diplome = diplome;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	
	

	
	
	

}
