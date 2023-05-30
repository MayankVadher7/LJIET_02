import java.util.Scanner;

public class Circle {
	
	double radius;
	double area;
	double circumference;
	final double PI=3.14159;
	
	public void acceptRadius() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Radius of the Circle:");
	radius=sc.nextDouble();
	sc.close();
	}
	
	public void Calculate() {
		circumference=2*PI*radius;
		area=PI*radius*radius;
	}
	
	public void Display() {
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        System.out.println("The circumference of the circle with radius " + radius + " is: " + circumference);
    }
	

	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.acceptRadius();
		c1.Calculate();
		c1.Display();
	}

}
