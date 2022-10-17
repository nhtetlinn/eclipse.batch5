package day1;

import java.util.Scanner;

public class testing1 {
	static final int MIN_PRICE =1000;
	static final float RATE= 1.5f;
	
	public static void main(String[] args) {
		//create stream
		Scanner sc = new Scanner(System.in);
//		user input
		System.out.print("Enter price:");
		int price = sc.nextInt();//2000
		//filter
		if(price < MIN_PRICE) {
			price = MIN_PRICE;
		}
		//output
		System.out.println("PRice =" + price);
		System.out.println("Enpense = "+ price * RATE);
		//rate = 2.5f;
	}
}
