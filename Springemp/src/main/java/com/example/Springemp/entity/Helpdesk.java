package com.example.Springemp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table

public class Helpdesk {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 
	int id;
	String name;
	String complaintDesc;
	LocalDate Date;
	public Helpdesk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Helpdesk(int id, String name, String complaintDesc, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.complaintDesc = complaintDesc;
		Date = date;
	}
	@Override
	public String toString() {
		return "Helpdisk [id=" + id + ", name=" + name + ", complaintDesc=" + complaintDesc + ", Date=" + Date + "]";
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
	public String getComplaintDesc() {
		return complaintDesc;
	}
	public void setComplaintDesc(String complaintDesc) {
		this.complaintDesc = complaintDesc;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	
	
}


