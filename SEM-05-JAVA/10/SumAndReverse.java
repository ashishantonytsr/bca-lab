// Sum and Reverse of the number

import java.io.*;
import java.util.Scanner;

public class SumAndReverse
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = s.nextInt();

		int sum = 0, rev = 0;
		for(int i = num; i != 0; i /= 10){
			int dig = i % 10;
			sum += dig;
			rev = ( rev * 10) + dig;
		}

		System.out.println("\nSum of digits is " + sum + "\nReverse of the number is " + rev);
	}
}


// expected output
/* 
Enter the number : 345

Sum of digits is 12
Reverse of the number is 543 
*/