import java.io.*;
import java.util.Scanner;

public class MergeTwoArrays
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number of elements in first array : ");
		int n1 = s.nextInt();
		int first[] = new int[n1];
		System.out.print("Enter the elements into first array : ");
		for (int i=0; i<n1; i++) first[i] = s.nextInt();

		System.out.print("Enter the number of elements in second array : ");
		int n2 = s.nextInt();
		int second[] = new int[n2];
		System.out.print("Enter the elements into second array : ");
		for (int i=0; i<n2; i++) second[i] = s.nextInt();

		int result[] = new int[n1 + n2];
		for (int i = 0; i < n1; i++){
			result[i] = first[i];
		}
		for (int k = n1, i = 0; k < n1 + n2;){
			result[k++] = second[i++];
		}
		for (int i=0; i<n1+n2; i++)
			for (int j=0; j<(n1+n2)-1; j++)
				if (result[j] > result[j+1])
				{
					int temp = result[j];
					result[j] = result[j+1];
					result[j+1] = temp;
				}

		for (int i = 0; i < n1+n2; i++)
				System.out.print(result[i] + " ");
			System.out.println();
	
	}
}

// expected output
/* 
Enter the number of elements in first array : 4      
Enter the elements into first array : 5 8 7 3
Enter the number of elements in second array : 3 6 9 2        
Enter the elements into second array : 2 3 5 6 7 8 9 
*/