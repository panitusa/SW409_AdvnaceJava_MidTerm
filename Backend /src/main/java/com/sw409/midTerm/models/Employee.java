package com.sw409.midTerm.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name = "Employees")
public class Employee {

	String name, title;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer Id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Employee() {
		
	}
	
	public Employee(String name, Integer Id, String title) {
		this.name = name;
		this.Id = Id;
		this.title = title;
		
	}
}
