package com.prowings.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationInheritanceDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Person p1 = new Person("male", 5.10f, 65);

		Employee emp1 = new Employee(10, "Ram", "Female", 5.5f, 55);

		System.out.println(emp1);
		System.out.println("Gender : " + emp1.getGender());
		System.out.println("Height : " + emp1.getHeight());
		System.out.println("Weigth : " + emp1.getWeight());

		File file = new File("EmployeeInheritance.txt");

//	Serialization
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		System.out.println("Object Return to file Successfully");

//	Deserialization
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

//		Person deserilizedPerson = (Person) ois.readObject();
		Employee deserilizedEmployee = (Employee) ois.readObject();

		System.out.println("Employee after deserialization :" + deserilizedEmployee);
		System.out.println("Gender :" + deserilizedEmployee.getGender());
		System.out.println("Height :" + deserilizedEmployee.getHeight());
		System.out.println("Weigth :" + deserilizedEmployee.getWeight());

//		System.out.println(deserilizedEmployee.getCountry());
//		System.out.println(deserilizedPerson);

	}
}
