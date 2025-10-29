package day5.heirarchicalinheritance;

public class Person {
	public Person(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(null, null);
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Object p;
		p = new Person("Dhruv", "Mumbai");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("Nikhil", "Mumbai", 101, 67000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("Pankaj", "Pune", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);
	}

}

