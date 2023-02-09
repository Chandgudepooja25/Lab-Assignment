package com.student.jdbcexample;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class App 
{  
	
    public static void main( String[] args )
    {   App a=new App();
   
    	System.out.println("1:insertion\n  2:Updation\n  3: deletion \n 4:show data");
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Choose any no. :");
    	int choose=sc.nextInt();
    	switch(choose) {
    	case 1: a.insertion();
    	       break;
    	case 2:a.updation();
    	       break;
    	case 3:a.deletion();
    	break;
    	case 4:a.show();
    	break;
    	default:
    		System.out.println("something wrong ");
    	}
    		
       
    }  
    
     public void insertion() {
    	try {
        	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Pooja20");
        	if(con.isClosed()) {
        		System.out.println("The connection is close");
        	}
       	else {
       		System.out.println("the connection is established");
       	}
        	
        	//creating the insert statement 
        	
        	String q="insert into students(Id,sName,Age,BOD) values(?,?,?,?)";
        	PreparedStatement pstmt=con.prepareStatement(q);
        	Scanner sc=new Scanner(System.in);
        	System.out.println("enter id");
        	int id=sc.nextInt();
        	pstmt.setInt(1,id);
        	System.out.println("enter name");
        	String name=sc.next();
        	pstmt.setString(2,name);
        	System.out.println("age");
        	int age=sc.nextInt();
        	pstmt.setInt(3, age);
        	System.out.println("enter birth of date");
        	Date date = Date.valueOf(sc.next());
        	//String date="2001-02-11";
        	pstmt.setDate(4, date);
        	pstmt.executeUpdate();
        	con.close();
        	
    	}
        catch(Exception e){
        	System.out.println(e);
        }
    	}
    	
    	
    	
    	public void updation() {
        	try {
            	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Pooja");
            	 if(con.isClosed()) {
            		 System.out.println("The connection is close");
            	  }
           	    else {
           		System.out.println("the connection is established");
           	     }
            	 
            //update the data in the database
            	 
            	 
        	String q="update students set sName=?,Age=?,BOD=? where Id=?";
        	PreparedStatement pstmt=con.prepareStatement(q);
        	//taking datafrom the user
        	
        	Scanner sc=new Scanner(System.in);
        	System.out.println("enter name");
        	String name=sc.next();
        	System.out.println("age");
        	int age=sc.nextInt();
        	System.out.println("enter birth of date");
        	Date date = Date.valueOf(sc.next());
        	System.out.println("enter id");
        	int id=sc.nextInt();
        	
        	//setting the values in the query
        	
        	pstmt.setString(1,name);
        	pstmt.setInt(2, age);
        	pstmt.setDate(3, date);
        	pstmt.setInt(4,id);
        	pstmt.executeUpdate();
        	con.close();
        	System.out.println("Update data succesfully");
        	
        	 }
            catch(Exception e){
            	System.out.println(e);
            }
    	}
        	
        	
        public void deletion() {
          try {
                	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Pooja");
                	if(con.isClosed()) {
                		System.out.println("The connection is close");
                	}
                 	else {
               		System.out.println("the connection is established");
                  	}
        	String q="delete from students where Id=?";
        	PreparedStatement  pstmt=con.prepareStatement(q);
        	//taking data from user
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the ID you want to delete :");
        	int id=sc.nextInt();
        	//setting the values in the query
        	pstmt.setInt(1, id);
            System.out.println("Delete data succesfully ");
        	//execute the prepared statement
        	pstmt.executeUpdate();
        	//closing the connection
        	con.close();
            	 }
                catch(Exception e){
                	System.out.println(e);
                }
        }
       public void show() {
            	try {
                	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Pooja");
                	if(con.isClosed()) {
                		System.out.println("The connection is close");
                	}
               	else {
               		System.out.println("the connection is established");
               	}
                	
        
        	String q="select * from students ";
        	PreparedStatement  pstmt=con.prepareStatement(q);
        	ResultSet rset=pstmt.executeQuery();
        	while(rset.next()) {
        		int id=rset.getInt(1);
        		String name=rset.getString(2);
        		int age=rset.getInt(3);
        		Date date=rset.getDate(4);
        		System.out.println("Id "+id+"         Name :"+name+"          Age:"+age+"             BOD:"+date);
        	}
        
        	con.close();
        	 }
        catch(Exception e){
        	System.out.println(e);
        }
    }
}