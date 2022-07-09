package com.example.demo.retailstore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items_table")

public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String name;
	Double price;
	Double quentity;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getQuentity() {
		return price;
	}
	public void setQuentity(Double quentity) {
		this.quentity = quentity;
	}
	
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", quentity=" + quentity + "]";
	}
}
