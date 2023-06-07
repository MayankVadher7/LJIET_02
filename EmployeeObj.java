package arrayOfObject;

import java.util.Scanner;

public class EmployeeObj {

    private static int Count = 0; // Static variable to track the count of employees
    private int id;
    private String name;

    public EmployeeObj(int id,String name) {
    	super();
    	this.id=id;
        this.name = name;
        Count++; // Increment the employee count each time a new Employee object is created
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return Count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empcount=0;
        for(int i=0;i<5;i++)
        {
        	empcount++;
        	System.out.println("Enter details for employee"+empcount+":");
        	System.out.println("Employee ID: ");
        	int id=sc.nextInt();
        	
        	System.out.println("Employee Name:");
        	String name=sc.next();
        	
        	EmployeeObj e=new EmployeeObj(id,name);
        	System.out.println();
        }
        System.out.println("Total number of employees= "+EmployeeObj.getCount());
        sc.close();
    }
}
