// Base conversion from a base 10 number

import java.io.*;
import java.util.Scanner;

public class BaseConversion{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a base 10 number : ");
		int n = s.nextInt();

		System.out.print("Choose the base to be converted "+
			"\n1. Binary\n2. Octal\n3. Hexadecimal\n-> ");
		short choice = s.nextShort();
		int base = (choice == 1) ? 2 : (choice == 2) ? 8 : (choice == 3) ? 16 : 0;

		int num = n, count = 0;
		char result[] = new char[15];

		do
		{
			int rem = num % base;
			int digit = '0' + rem; // ASCII conversion

			if (digit > '9')
				digit = digit + 7; // Adding 7 to reach alphabet section
			result[count++] = (char)digit;
			num /= base; // updation

		} while (num != 0);

		System.out.print("\nBase "+base+" equivalent of num "+n +" is ");
		for (int i = count - 1; i >= 0; --i)
			System.out.print(result[i]);
		System.out.println();
	}
}

// expected output
/* 
Enter a base 10 number : 43
Choose the base to be converted 
1. Binary
2. Octal
3. Hexadecimal
-> 3

Base 16 equivalent of num 43 is 2B
*/