package com.example.Springemp.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table

public class userEntity {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
 
	int id;
	String name;
	String password;
	String Email;
	public userEntity(int id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		Email = email;
	}
	public userEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "userEntity [id=" + id + ", name=" + name + ", password=" + password + ", Email=" + Email + "]";
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
}
