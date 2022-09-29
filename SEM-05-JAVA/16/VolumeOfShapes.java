// Volume of shapes using Method Overloading

import java.lang.Math;
import java.util.Scanner;

public class VolumeOfShapes{

	// Cube
	static double volume (double side){
		return Math.pow(side, 3);
	}

	// Cylinder
	static double volume (double radius, double height){
		return Math.PI * radius * radius * height;
	}

	// Rectangular Box
	static double volume (double length, double breadth, double height){
		return length * breadth * height;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Choose from below \n1. Cube \n2. Cylinder \n3. Rectangular box");
		short option = s.nextShort();
		
		switch (option) {
			case 1:
				System.out.println("Enter the length of each sides : ");
				System.out.println("The volume is " + volume(s.nextDouble()) );		
				break;

			case 2:
				System.out.println("Enter the radius & height : ");
				System.out.println("The volume is " + volume(s.nextDouble(), s.nextDouble()) );		
				break;

			case 3:
				System.out.println("Enter the length, breadth & height : ");
				System.out.println("The volume is " + volume(s.nextDouble(), s.nextDouble(), s.nextDouble()));		
				break;

			default:
				System.out.println("invalid Option");
		}		
	}
}