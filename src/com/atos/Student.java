package com.atos;

public class Student 
{
	private int studId;
    private String studName;
    private int studMarks;
    private boolean studStatus;
    
   public Student() 
   {
		super();
		
	}

public Student(int studId, String studName, int studMarks, boolean studStatus) 
{
	super();
	this.studId = studId;
	this.studName = studName;
	this.studMarks=studMarks;
	this.studStatus = studStatus;
}

public int getStudId()
{
	return studId;
}

public void setStudId(int studId) 
{
	this.studId = studId;
}

public String getStudName() {
	return studName;
}

public void setStudName(String studName) 
{
	this.studName = studName;
}

public int getStudMarks() 
{
	return studMarks;
}

public void setStudMarks(int studMarks)
{
	this.studMarks = studMarks;
}

public boolean isStudStatus() 
{
	return studStatus;
}

public void setStudStatus(boolean studStatus)
{
	this.studStatus = studStatus;
}

@Override
public String toString() 
{
	return "Student [studId=" + studId + ", studName=" + studName + ", studMarks=" + studMarks + ", studStatus="
			+ studStatus + "]";
}

}
