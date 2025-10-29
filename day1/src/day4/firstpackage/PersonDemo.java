//Program to demonstrate creating objects
package day4.firstpackage;

import java.util.Scanner;

public class PersonDemo {
	public static void main(String args[]) {
		Person p1 = new Person(); // default constructor invoked

		Scanner sc = new Scanner(System.in);
		String name;
		Comparable<String> city;
		int age;
		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		// p1.personName=name private member can't accessible
		p1.setPersonName(name);
		p1.setPersonAge(age);
		p1.setPersosnCity(city);
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() + "\tCity : "
				+ p1.getPersonAge());

		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		p1 = new Person(); // parameterized constructor invoked);
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() + "\tCity : "
				+ p1.getPersonAge());
		sc.close();

	}
}