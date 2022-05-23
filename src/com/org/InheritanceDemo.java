package com.org;


  //main class
import com.atos.Student;
import com.shapes.Square;

public class InheritanceDemo   
{
   public static void main(String[] args) 
   {
	//Student st=new Student();	
	//st.setStudId(101);
	//st.setStudName("Ganesh");
	//st.setStudMarks(100);
	//st.setStudStatus(true);
	
	//System.out.println(st);
	   
	Square s1=new Square(2);
	s1.draw();
	s1.draw2d();
	s1.message();
}
   
}
