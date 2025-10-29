package day3.scannerdemo;

import java.util.Scanner;

import day4.firstpackage.Person;

public class PersonDemo {
	public static void main(String[] args) {

		//scanner object to accept user inputs
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter Person Name : ");
		System.out.println("Enter age: ");
		int age = ob.nextInt();
		System.out.println("Enter gender: ");
		String gender = ob.next();
		System.out.println("Enter taxable income: ");
		int income = ob.nextInt();
		
		//Person object and initialize values using setter
		Person person = new Person();
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		//display person details using toString() method
		System.out.println(person);
		
		System.out.println("After calculating tax : ");
		System.out.println(person);

		ob.close();
}
}
