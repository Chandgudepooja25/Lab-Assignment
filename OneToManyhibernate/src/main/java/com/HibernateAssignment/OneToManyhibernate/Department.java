package com.HibernateAssignment.OneToManyhibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Department {
	@Id              //@Id is use to create the primary key
	private int Dept_id;
	private String Dept_name;
	
	//Annotation use for mapping Department and Employee table
	@OneToMany
	private List<Employee>employee;
	
    //Create the getter and setter method
	public int getDept_id() {
		return Dept_id;
	}

	public void setDept_id(int dept_id) {
		Dept_id = dept_id;
	}

	public String getDept_name() {
		return Dept_name;
	}

	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
    //create constructor from getter and setter
	public Department(int dept_id, String dept_name, List<Employee> employee) {
		super();
		Dept_id = dept_id;
		Dept_name = dept_name;
		this.employee = employee;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
