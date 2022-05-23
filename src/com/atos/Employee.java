package com.atos;

public class Employee //parent class
{
   int empid;
   String empName;
   String empDesignation;

   
   public Employee(int empid,String empName,String empDesignation )
   {
	   super();
	   this.empid=empid;
	   this.empName=empName;
	   this.empDesignation=empDesignation;
   }
   public void display()
   {
	   System.out.println("Display Employee details");
   }
}
