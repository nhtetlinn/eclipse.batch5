package day1;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full name: ");
		String name = sc.nextLine();
		//sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		//sc.nextLine();
		System.out.print("Enter Phone.No: ");
		String phno = sc.nextLine();
		//sc.nextLine();
		System.out.print("Education: ");
		String education = sc.nextLine();
		System.out.print("Income: ");
		double income = sc.nextDouble();
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		
		System.out.println("-----Profile------");
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Phone.No: "+ phno);
		System.out.println("Education: "+ education);
		System.out.println("Income: "+ income);
		System.out.println("Age: "+ age);
		
		sc.close();
	}
}
