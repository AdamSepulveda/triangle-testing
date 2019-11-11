import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		
		double x1, x2, x3, y1, y2, y3;
		
		System.out.print("Enter x value of point 1: ");
		x1 = scnr.nextDouble();
		
		System.out.print("Enter y value of point 1: ");
		y1 = scnr.nextDouble();
		
		System.out.print("Enter x value of point 2: ");
		x2 = scnr.nextDouble();
		
		System.out.print("Enter y value of point 2: ");
		y2 = scnr.nextDouble();
		
		System.out.print("Enter x value of point 3: ");
		x3 = scnr.nextDouble();
		
		System.out.print("Enter y value of point 3: ");
		y3 = scnr.nextDouble();
		
		Point pt1 = new Point(x1, y1);
		
		Point pt2 = new Point(x2, y2);
		
		Point pt3 = new Point(x3, y3);
		
		Triangle tri = new Triangle(pt1, pt2, pt3);
		
		/*
		double s1, s2, s3;

		System.out.print("Enter length of side 1: ");

		s1 = scnr.nextDouble();

		System.out.print("Enter length of side 2: ");

		s2 = scnr.nextDouble();

		System.out.print("Enter length of side 3: ");

		s3 = scnr.nextDouble();

		Triangle tri = new Triangle(s1, s2, s3);
		*/
		if (tri.isValid() == false)
		{
			System.out.println("Type: Invalid Triangle");
		}
		
		else if (tri.checkRightAngle() == true)
		{
			System.out.println("Type: Right " +tri.getType() + " Triangle");
		}
		else 
		{
			System.out.println("Type: " +tri.getType() + " Triangle");
		}
		
		
		
		
		System.out.println("Area: " + tri.getArea());
		
	}

}
