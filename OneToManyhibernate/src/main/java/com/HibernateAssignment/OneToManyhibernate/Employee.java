package com.HibernateAssignment.OneToManyhibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id@Column(name="E_id")//Assigning the primary key
	private int Emp_id;
	private String Emp_name;
	@ManyToOne@JoinColumn(name="Dept_id")//join the two column
	//create object for Department table
	private Department department;
	
	//generate getter and setter
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	//create constructor from getter and setter
	public Employee(int emp_id, String emp_name, Department department) {
		super();
		Emp_id = emp_id;
		Emp_name = emp_name;
		this.department = department;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
