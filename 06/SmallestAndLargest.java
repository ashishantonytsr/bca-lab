import java.io.*;
import java.util.Scanner;

public class SmallestAndLargest{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number of elements : ");
		int n = s.nextInt();
		int array[] = new int[n];
		System.out.print("Enter the elements into array : ");
		for (int i=0; i<n; i++) array[i] = s.nextInt();

		for (int i=0; i<n; i++)
			for (int j=0; j<n-1; j++)
				if (array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}

		System.out.println("\nSmallest - "+array[0]+"\nLargest - "+array[n-1]+"\nSecond Largest - "+array[n-2]);
	}
}