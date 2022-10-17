package day1;

public class testing4 {
	int num1 = 100;//instance field
	static int num2 = 200;//static field
	static void staticMethod1() {
	// cannot access
		//num1 = 300; //num1 is instance data
	num2 = 300; //ok num2 is static data
	staticMethod2();
	}
	void instanceMethod1() {
		System.out.println("This is instance method");
		num1 = 300;
		num2 = 400;
		staticMethod2();
		
	}
	static void staticMethod2() {
		System.out.println("This is static method 2");
	}
public static void main(String[] args) {
	
}
}
