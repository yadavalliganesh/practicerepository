package com.lamda;

import java.util.Scanner;

public interface CarMain 
{
    public static void main(String[] args) 
    {
    	//int model=6;
	   //Icar ic=() -> System.out.println("my car brand is BMW "+model);	
	  // ic.brand();
    	//Icar ic1=() -> 
    	//{
    		//return "very fast car";
    	//};
    	
    	//System.out.println(ic1.speed());
    	
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the two numbers");
    	int a,b;
    	a=sc.nextInt();
    	b=sc.nextInt();
    	if(a==b)
    	{
    		System.out.println("variables both are equal");
    	}
    	else
    	{
    		System.out.println("values are differnt");
    	}
    	System.out.println("-----working with Strings------");
    	System.out.println("Enter two strings");
    	String str1=sc.next();
    	String str2=sc.next();
    	
    	
    	if(str1.equals(str2))
    	{
    		System.out.println("Equal");
    	}
    	else
    	{
    		System.out.println("not equal");
    	}
    	
    }
}
