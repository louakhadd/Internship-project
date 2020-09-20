package tn.fivepoints.spring.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Training implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;	
	private float prix;
	private String picture;
	private String title;
	
	@Lob
	private String Description;
	
	private int nbParticipants;
	private int nbHeuresD;
	private int nbHeuresND;
	
	private int nblike;
	
	@Enumerated(EnumType.STRING)
	private Level level;
	
	@Enumerated(EnumType.STRING)
	private TrainingCategory category;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="training",fetch=FetchType.EAGER) 
	private Set<TrainingRegistration> trainingRegistrations;
	
	@ManyToOne
	User user;
	
	
	
/////////////////////////	Constructeurs		//////////////////////////
	
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Training(int id, int nblike) {
		super();
		Id = id;
		this.nblike = nblike;
	}
	
	/////////////////////////	Getters and Setters		//////////////////////////
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getNbParticipants() {
		return nbParticipants;
	}
	public void setNbParticipants(int nbParticipants) {
		this.nbParticipants = nbParticipants;
	}
	public Set<TrainingRegistration> getTrainingRegistrations() {
		return trainingRegistrations;
	}
	public void setTrainingRegistrations(Set<TrainingRegistration> trainingRegistrations) {
		this.trainingRegistrations = trainingRegistrations;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	public int getNbHeuresD() {
		return nbHeuresD;
	}
	public void setNbHeuresD(int nbHeuresD) {
		this.nbHeuresD = nbHeuresD;
	}
	public int getNbHeuresND() {
		return nbHeuresND;
	}
	public void setNbHeuresND(int nbHeuresND) {
		this.nbHeuresND = nbHeuresND;
	}
	public TrainingCategory getCategory() {
		return category;
	}
	public void setCategory(TrainingCategory category) {
		this.category = category;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public int getNblike() {
		return nblike;
	}
	public void setNblike(int nblike) {
		this.nblike = nblike;
	}
	

	
	@Override
	public String toString() {
		return "Training [Id=" + Id + ", prix=" + prix + ", picture=" + picture + ", title=" + title + ", Description="
				+ Description + ", nbParticipants=" + nbParticipants + ", nbHeuresD=" + nbHeuresD + ", nbHeuresND="
				+ nbHeuresND + ", nblike=" + nblike + ", level=" + level + ", category=" + category
				+ ", trainingRegistrations=" + trainingRegistrations + ", user=" + user + "]";
	}
	
	

	
	
	

	
	

}
