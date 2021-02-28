package core.comparator;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Student> {

	public int compare(Student obj1, Student obj2) {

		if (obj1.getName().compareTo(obj2.getName())== 0  ){
			return obj1.getRollNo() - obj2.getRollNo();			
		}
		
		return obj1.getName().compareTo(obj2.getName());

	}
}
