package tn.fivepoints.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CommentReply implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private Date date;
	private String contenue;
	private String email;
	
	@ManyToOne
	Comment comm;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getContenue() {
		return contenue;
	}

	public void setContenue(String contenue) {
		this.contenue = contenue;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Comment getComm() {
		return comm;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CommentReply() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommentReply(String name, Date date, String contenue, String email, Comment comm) {
		super();
		this.name = name;
		this.date = date;
		this.contenue = contenue;
		this.email = email;
		this.comm = comm;
	}

	@Override
	public String toString() {
		return "CommentReply [id=" + id + ", name=" + name + ", date=" + date + ", contenue=" + contenue + ", email="
				+ email + "]";
	}
	
	

}
