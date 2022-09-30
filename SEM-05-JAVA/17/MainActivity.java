// Order of Constructors in multi-level inheritance
// NOTE : NOT SURE ABOUT THE PROGRAM; COPY AT YOUR OWN RISK

class Shape {
	Shape() {
		System.out.println("This is a shape");
	}
}

class Rectangle extends Shape {
	Rectangle() {
		System.out.println("This is a rectangle inherited from shape");
	}
}

class Cube extends Rectangle {
	Cube() {
		System.out.println("This is a cube inherited from rectangle");
	}
}

public class MainActivity {
	public static void main(String[] args) {
		Cube c = new Cube();
	}	
}
