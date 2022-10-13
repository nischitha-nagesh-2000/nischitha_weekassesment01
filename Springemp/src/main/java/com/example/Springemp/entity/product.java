package com.example.Springemp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table

public class product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	int id;
	String name;
	float cost;
	float discount;
	public product(int id, String name, float cost, float discount) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
	} 
	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", cost=" + cost + ", discount=" + discount + "]";
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
}
