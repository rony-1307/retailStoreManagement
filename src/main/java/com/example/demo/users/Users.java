package com.example.demo.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users_table")

public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String name;
	Number phno;
	String email;
	String address;
	String password;
	Double walet;
	Double currentorder;
	Double orderhistory;
	
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
	public Number getPhno() {
		return phno;
	}
	public void setPhno(Number phno) {
		this.phno = phno;
	}	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	public Double getWalet() {
		return walet;
	}
	public void setWalet(Double walet) {
		this.walet = walet;
	}
	public Double getCurrentorder() {
		return currentorder;
	}
	public void setCurrentorder(Double currentorder) {
		this.currentorder = currentorder;
	}
	public Double getOrderhistory() {
		return orderhistory;
	}
	public void setOrderhistory(Double orderhistory) {
		this.orderhistory = orderhistory;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phno=" + phno + ", address=" + address + ", password=" + password + ",walet=" + walet + ", currentorder=" + currentorder +", orderhistory=" + orderhistory + "]";
	}
	
}
