package day1;

public class Employee {
	
	int empNo;
	String name;
	static String company;
	
	
	public void display() {
		System.out.println("No =" + empNo);
		System.out.println("Name =" + this.name);
	}
	
	public static void displayCompanyName() {
		System.out.println("Company =" + company);
	}
	
	public static void ChangeCompanyName(String name) {
		company = name;
	}
}
