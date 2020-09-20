package tn.fivepoints.spring.entities;

import java.io.Serializable;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;



@Entity
public class Blog implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;
	private Date date;
	private String auteur;
	
	private String image;
	
	@Lob
	private String contenue;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="blog",fetch=FetchType.EAGER) 
	private Set<Comment> comments; 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuteur() {
		return auteur;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContenue() {
		return contenue;
	}
	public void setContenue(String contenue) {
		this.contenue = contenue;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Blog(int id, String title, Date date, String auteur, String image, String contenue, Set<Comment> comments) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.auteur = auteur;
		this.image = image;
		this.contenue = contenue;
		this.comments = comments;
	}
	public Blog(int id, String title, Date date, String auteur, String contenue) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.auteur = auteur;
		this.contenue = contenue;
	}
	public Blog(int id, String title, Date date, String auteur, String image, String contenue) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.auteur = auteur;
		this.image = image;
		this.contenue = contenue;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", date=" + date + ", auteur=" + auteur + ", image=" + image
				+ ", contenue=" + contenue + "]";
	}
	
	
	
	

	
}
