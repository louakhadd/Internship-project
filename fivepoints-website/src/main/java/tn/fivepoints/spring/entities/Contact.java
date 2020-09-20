package tn.fivepoints.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;	
	
	private String name;;
	private String subject;
	private String email;
	private String contenuMessage;
	

	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContenuMessage() {
		return contenuMessage;
	}
	public void setContenuMessage(String contenuMessage) {
		this.contenuMessage = contenuMessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Contact(String name, String subject, String email, String contenuMessage) {
	
		this.name = name;
		this.subject = subject;
		this.email = email;
		this.contenuMessage = contenuMessage;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Contact [Id=" + Id + ", name=" + name + ", subject=" + subject + ", Email=" + email
				+ ", ContenuMessage=" + contenuMessage + "]";
	}
	
	
	
	
	
	
}
