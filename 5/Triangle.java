import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class Armstrong
{
	public static void main(String args[])
	{
		int s1, s2, s3;
		Scanner s = new Scanner();
		System.out.print("Enter the three sides of a triangle : ");
		s1 = s.nextInt();
		s2 = s.nextInt();
		s3 = s.nextInt();
		
		if (s1 == s2  && s2 == s3)
			System.out.println("The triangle is equilateral triangle. ");
		else if (s1 == s2 || s2 == s3 || s3 == s1)
			System.out.println("The triangle is isosceles triangle. ");
		else 
			System.out.println("The triangle is scalene. ");
	}
}
