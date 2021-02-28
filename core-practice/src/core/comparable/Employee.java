package core.comparable;
public class Employee implements Comparable<Employee> {
	
	String name;
	int age;

	
	public Employee(String name , int age){
		this.name = name;
		this.age = age;
	}

	
	public int compareTo(Employee obj) {
		return this.name.compareTo(obj.name);
	}
	
	public String toString(){
		return this.name;
		
	}

}
