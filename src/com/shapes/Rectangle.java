package com.shapes;

public class Rectangle extends Shape
{
    public Rectangle(int l,int b)
    {
    	length=l;
    	breadth=b;
    }

	@Override
	public void draw() 
	{
		// TODO Auto-generated method stub
		int area=length*breadth;
		System.out.println("The area of Rectangle="+area);
		
	}
    
}
