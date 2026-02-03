package Basics;

public class ArrayDemo {
	public static void main(String[] args) {
		String[] studentNames = new String[10];
		System.out.println(studentNames[0]); // it will print null because string array stores null as default .

		int[] nums1 = { 10, 20, 30, 40 };
		int[] nums2 = nums1;

		nums2[0] = 99;

		System.out.println(nums1[0]);

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] = i);
		}

		for (int i = 0; i < studentNames.length; i++) {
			System.out.println("Student: " + studentNames[i]);
		}

		for (String Name : studentNames) {
			System.out.println("Student: " + Name);
		}

//		System.out.println(Arrays.toString(studentNames));

		int[] array = { 5, 2, 9, 1, 6 };

		array.sort();

	}
}
