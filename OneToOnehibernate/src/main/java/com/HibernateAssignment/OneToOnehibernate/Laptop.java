package com.HibernateAssignment.OneToOnehibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id   //assign the primary key
	@Column(name="Laptop_Id")
	private int id;
	
	private String name;
	//join column of two different table
	@OneToOne
	@JoinColumn(name="S_name")
	
    //create object of student table
	private Student student;
	
	// generate Getter and Setter method
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	//Create Constructor for getter and setter
	public Laptop(int id, String name, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
	}
	//generating object of super class
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
