package tn.fivepoints.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	public String nom;
	public String prenom;
	
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	public String numTel;
	public String email;
	private String password;
	private String role;
	
	 @Lob
	 private byte[] image;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="user",fetch=FetchType.EAGER) 
	private Set<Training> trainings;
	
	/*		Getters && Setters 		*/
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrénom() {
		return prenom;
	}
	public void setPrénom(String prénom) {
		this.prenom = prénom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String nom, String prenom, Date dateNaissance, String numTel, String email, String password,
			Set<Training> trainings) {
		super();
		Id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.numTel = numTel;
		this.email = email;
		this.password = password;
		this.trainings = trainings;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", numTel=" + numTel + ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}


	
		

	
}
