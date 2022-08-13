// Base conversion from a base 10 number

import java.io.*;
import java.util.Scanner;

public class BaseConversion{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a base 10 number : ");
		int n = s.nextInt();
		System.out.print("Enter the base to be converted: ");
		int base = s.nextInt();

		int num = n, count = 0;
		char res[] = new char[30];

		do
		{
			int rem = num % base;
			int digit = '0' + rem;
			if (digit > '9')
				digit = digit + 7;
			res[count] = (char)digit;
			count++;
			num /= base; // updation
		} while (num != 0);

		System.out.print("\nBase "+base+" equivalent of num "+n +" is ");
		for (int i = count - 1; i >= 0; --i)
			System.out.print(res[i]);
		System.out.println();
	}
}

// expected output
/* 
Enter a base 10 number : 15
Enter the base to be converted: 16

Base 16 equivalent of num 15 is F 
*/