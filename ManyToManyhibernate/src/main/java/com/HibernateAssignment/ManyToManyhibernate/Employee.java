package com.HibernateAssignment.ManyToManyhibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



@Entity(name="Emp_Table")
public class Employee {
	@Id @Column(name="Emp_Id")
	private int Emp_id;
	private String Emp_name;
	
	//Annotation use for mapping Employee and Project table
	@ManyToMany  @JoinTable(name="Project_Emp_Table",
	joinColumns={@JoinColumn(name="id")},
	inverseJoinColumns= {@JoinColumn(name="Emp_id")})
	private List<Project>project;
	//Create the getter and setter method
	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}
	
   ////create constructor from getter and setter
	public Employee(int emp_id, String emp_name, List<Project> project) {
		super();
		Emp_id = emp_id;
		Emp_name = emp_name;
		this.project = project;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
