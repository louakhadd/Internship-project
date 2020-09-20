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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Comment implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private Date date;
	private String contenue;
	private String email;
	
	@ManyToOne
	Blog blog;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="comm",fetch=FetchType.EAGER) 
	private Set<CommentReply> replys;  
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContenue() {
		return contenue;
	}
	public void setContenue(String contenue) {
		this.contenue = contenue;
	}
	public Blog getBlog() {
		return blog;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Comment(String name, Date date, String contenue, String email) {
		super();
		this.name = name;
		this.date = date;
		this.contenue = contenue;
		this.email = email;
	}
	public Comment(int id, String name, Date date, String contenue) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.contenue = contenue;
	}
	
	public Comment(int id, String name, Date date, String contenue, Blog blog) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.contenue = contenue;
		this.blog = blog;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", name=" + name + ", date=" + date + ", contenue=" + contenue + ", email=" + email
				+ "]";
	}
	
	
	
	


	
	
	

}
