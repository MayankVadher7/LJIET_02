import java.util.Scanner;

public class Circle {
	
	double radius;//Instance variable for radius 
	double area;//Instance variable for area
	double circumference;//Instance variable for circumference 
	final double PI=3.14159;//Constant for PI
	
	public void acceptRadius() {
	Scanner sc=new Scanner(System.in);//creation of Scanner object
	System.out.println("Enter Radius of the Circle:");
	radius=sc.nextDouble();//accept the value from user
	sc.close();
	}
	//Method for calculate circumference and area of circle
	public void Calculate() {
		circumference=2*PI*radius;
		area=PI*radius*radius;
	}
	//Method for display area and circumference of circle
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
