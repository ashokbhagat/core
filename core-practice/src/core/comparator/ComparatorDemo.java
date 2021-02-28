package core.comparator;

import java.util.*;

public class ComparatorDemo {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student("B", 10));
		studentList.add(new Student("A", 19));
		studentList.add(new Student("A", 16));
		studentList.add(new Student("A", 17));
		studentList.add(new Student("D", 7));
		studentList.add(new Student("C", 9));

		Collections.sort(studentList, new ComparatorImpl());

		for (Student student : studentList) {
			System.out.println(student.getName() + student.getRollNo());

		}
	}

}
