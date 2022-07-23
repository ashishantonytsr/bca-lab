// Check whether the triangle is equilateral, isosceles or scalene

// Algorithm
/* 
1. Start
2. Read length of three sides of the triangle as 
	s1, s2, s3 respectively
3. if s1 = s2 and s2 = s3, 
	print "Equilateral"
4. else if s1 = s2 or s2 = s3 or s3 = s1,
	print "Isosceles"
5. else
	print "Scalene"
6. Stop
*/

import java.io.*;

public class Triangle
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the three sides of a triangle : ");
		int s1 = Integer.parseInt(in.readLine());
		int s2 = Integer.parseInt(in.readLine());
		int s3 = Integer.parseInt(in.readLine());
		
		if (s1 == s2  && s2 == s3)
			System.out.println("\nThe triangle is equilateral triangle. ");
		else if (s1 == s2 || s2 == s3 || s3 == s1)
			System.out.println("\nThe triangle is isosceles triangle. ");
		else 
			System.out.println("\nThe triangle is scalene. ");
	}
}

// Expected output
/* 
Enter the three sides of a triangle : 
5
6
5

The triangle is isosceles triangle.
*/