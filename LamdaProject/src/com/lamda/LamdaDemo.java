package com.lamda;

public interface LamdaDemo
{
  public static void main(String[] args) 
  {
	 // Icalculator cl=() -> System.out.println("hello world");
	 // cl.display();
	  
	  Icalculator calc=(a, b) -> 
	  {
		  return a+b;
		  
	  };
	   int c=calc.addition(5, 10);
	   System.out.println(c);
   }
}
