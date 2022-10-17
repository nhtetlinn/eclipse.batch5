package day1;

public class demo1 {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee.ChangeCompanyName("Myanmar IT Consulting");
		
		emp1.empNo = 1001;
		emp1.name = "Kyaw Kyaw";
		
		emp2.empNo = 1001;
		emp2.name = "Aung Aung";
		
		emp1.display();
		Employee.displayCompanyName();
		System.out.println("--------------");
		emp2.display();
		Employee.displayCompanyName();
	}
}
