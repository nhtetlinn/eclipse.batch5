package day1;

public class testing2 {
	public static void main(String[] args) {
//		implicit
		int i = 100;
		long j = i;
		float a = i;
		
		System.out.println("i =" + i);
		System.out.println("j =" + j);
		System.out.println("a =" + a);
		
//		explicit
		short k = (short)i;
		float b = 3.6f;
		int c = (int)b;
		System.out.println("k =" + k);
		System.out.println("b =" + b);
		System.out.println("c =" + c);
		
		Person p1 = new Person();
		Student s1 = new Student();
		Teacher t1 = new Teacher();
		
		//
		p1 = s1;//convert child class to parent class
		
		Person p2 = new Person();
		//Teacher t2 = (Teacher)p2; // parent class to child class
		Student s2 = (Student)p1;
		
	}
}
class Person { //general(parent) class
	
}
class Student extends Person { //child class
	
}
class Teacher extends Person { //child class
	
}

