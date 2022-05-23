package com.atos;

public class Manajor extends Employee  //child class
{
	int manajorid;
	public Manajor(int empid, String empName, String empDesignation,int manajorid) 
	{
		super(empid, empName, empDesignation);
		// TODO Auto-generated constructor stub
		this.manajorid=manajorid;
	}
	@Override
	public String toString() {
		return "Manajor [manajorid=" + manajorid + ", empid=" + empid + ", empName=" + empName + ", empDesignation="
				+ empDesignation + "]";
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("calling manajor display");
	}
	
	

}
