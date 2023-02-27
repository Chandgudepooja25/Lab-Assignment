package com.HibernateAssignment.OneToOnehibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@Column(name="Student_Id")
	private int id;
	private String name;
	
	//join column of two different table
	@OneToOne
	@JoinColumn(name="L_id")
	//create object of student table
	private Laptop laptop;
	
	// Generate Getter and Setter method

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

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	//Create Constructor for getter and setter

	public Student(int id, String name, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.laptop = laptop;
	}
	//generating object of super class
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
