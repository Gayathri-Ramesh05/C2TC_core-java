package day10;

public class ArrayOfObjectsDemo {
	public static void main(String[] args) {
		// declares an Array of integers.
		Students[] arr;
		// allocating memory for 5 objects of type Student.
		arr = new Students[5];
		// initialize the first elements of the array
		arr[0] = new Students();
		// initialize the second elements of the array
		arr[1] = new Students();
		// so on...
		arr[2] = new Students();
		arr[3] = new Students();
		arr[4] = new Students();
		
		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].getRollNo()+ " " + arr[i].getName());
	}
}
