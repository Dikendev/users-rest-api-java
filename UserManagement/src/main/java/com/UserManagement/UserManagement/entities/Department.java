package com.UserManagement.UserManagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


@Entity
@Table(name = "tb_department")
public class Department {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long Id;
	private String name;
	
	public Department() {
		
	}
	
	// get and setters
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
