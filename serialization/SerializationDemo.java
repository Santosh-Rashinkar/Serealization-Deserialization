package com.prowings.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		Employee emp1 = new Employee(10, "Ram");

//		System.out.println(emp1);

		File file = new File("myEmployee.txt");

//      Serialization
			FileOutputStream fos = new FileOutputStream(file);

			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(emp1);
		
			System.out.println("Object Written to file successfully!!");

//		Deserialization
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			Employee deserializedEmp = (Employee) ois.readObject();
			System.out.println("Employee After deserialization : " + deserializedEmp);

			System.out.println(deserializedEmp.getCountry());
	}

}