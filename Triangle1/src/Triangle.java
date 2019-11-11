
import java.util.*;
import java.lang.Math;
//import package.Point.java

public class Triangle
{
	
	private double side1, side2, side3;
	/*
	Triangle(double s1, double s2, double s3) 
	{
		side1 = s1;

		side2 = s2;

		side3 = s3;
	}
	*/
	Triangle(Point pt1, Point pt2, Point pt3)
	{
		side1 = Math.sqrt(Math.pow(pt2.getX() - pt1.getX(),2) + Math.pow(pt2.getY() - pt1.getY(),2));
		side2 = Math.sqrt(Math.pow(pt3.getX() - pt1.getX(),2) + Math.pow(pt3.getY() - pt1.getY(),2));
		side3 = Math.sqrt(Math.pow(pt3.getX() - pt2.getX(),2) + Math.pow(pt3.getY() - pt2.getY(),2));
	}
	
public double getArea()
{
	double area = 0;
	
	double s = (side1 + side2 + side3) / 2;
	area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	
	return area;
}
	
public String getType() 
{
	
	String type = "";
	
	if(side1 == side2 && side1 == side3) 
	{
		type = "Equilateral";
	}
	else if (side1 == side2 || side1 == side3 || side2 == side3)
	{
		type = "Isosceles";
	}
	else if (side1 != side2 && side1 != side3 && side2 != side3) 
	{
		type = "Scalene";
	}
	return type;
}

public boolean checkRightAngle() 
{
	boolean angle = false;
	if(side1 > side2 && side1 > side3) 
	{
		if(side1*side1 == (side2*side2 + side3*side3)) 
		{
			angle = true;
		}
	}
	
	else if(side2 > side1 && side2 > side3) 
	{
		if(side2*side2 == (side1*side1 + side3*side3)) 
		{
			angle = true;
		}
	}
	
	else if(side3 > side1 && side3 > side2) 
	{
		if(side3*side3 == (side1*side1 + side2*side2)) 
		{
			angle = true;
		}
	}
	
	return angle;
}

public boolean isValid() 
{
	boolean valid = false;
	
	if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
	{
		valid = true;
	}
	
	if(side1 <= 0 || side2 <= 0 || side3 <= 0 )
	{
		valid = false;
	}
	
	return valid;
}

}
