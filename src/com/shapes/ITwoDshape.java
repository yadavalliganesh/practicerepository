package com.shapes;

public interface ITwoDshape 
{
   public void draw2d();
   public default void message()
   {
	   System.out.println("Welcome to the shapes applications");
   }
   
}
