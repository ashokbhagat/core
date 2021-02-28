package core.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import core.comparable.Employee;

class Demo implements java.io.Serializable {

	private static final long serialVersionUID = -2235695467837039678L;
	public int a;
	public String b;
	public Employee emp;

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		System.out.println("==============");
		this.a = (int) in.readObject();
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		System.out.println("###############");
		out.writeObject(this.a);
	}

	@Override
	public String toString() {
		return "Demo [a=" + a + ", b=" + b + "]";
	}

}

public class SerializableDemo {
	public static void main(String[] args) {
		Demo object = new Demo();
		object.setA(10);
		object.setB("AShok");
		object.setEmp(new Employee("", 20));

		String filename = "file.ser";

		// Serialization
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		}

		catch (IOException ex) {
			ex.printStackTrace();
		}

		Demo object1 = null;

		// Deserialization
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object1 = (Demo) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println(object1);
		}

		catch (IOException ex) {
			ex.printStackTrace();
		}

		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}
}
