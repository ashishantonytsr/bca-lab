import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class Armstrong
{
	public static void main(String args[])
	{
		int low, high, i, temp, num, rem, dig;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the lower & upper limit : ");
		low = s.nextInt();
		high = s.nextInt();

		for (i = low+1; i < high; ++i)
		{
			num=0;
			dig = (int)Math.log10(i) + 1;
			for (temp = i; temp != 0; temp /= 10)
			{
				rem = temp %10;
				num += Math.pow(rem, dig);
			}
			if (i == num)
				System.out.print(i + " ");
		}
		System.out.println();
	}
}