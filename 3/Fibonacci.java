// Fibonacci Series

import java.io.*;
import java.util.Scanner;
public class Fibonacci
{
	public static void main(String args[])
	{
		int f=0, s=1, t, limit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit : ");
		limit = sc.nextInt();
		System.out.print("\nFibonacci series upto the limit are "+ f +" "+ s);
		for(int i = 2; i <= limit; i = f + s)
		{
			t = f + s;
			System.out.print(" " + t);
			t = f + s;
			f = s; s = t;
		}
		System.out.println();
	}
}

// Expected output
/*
Enter the limit : 15

Fibonacci series upto the limit are 0 1 1 2 3 5 8 13 
*/