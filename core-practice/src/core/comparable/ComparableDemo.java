package core.comparable;
import java.util.*;

public class ComparableDemo {

	public static void main(String[] args) {
		
		Employee emp1= new Employee("nitin", 26);
		Employee emp2= new Employee("ashok", 25);
		Employee emp3= new Employee("bhagat", 22);
		Employee emp4= new Employee("ramesh", 35);
		Employee emp5= new Employee("dhanu", 18);
		List<Employee> empList = new ArrayList<Employee>(5);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		Collections.sort(empList);
		
		System.out.println(empList);
		
		emp1.toString();
		

	}
	
	

}
