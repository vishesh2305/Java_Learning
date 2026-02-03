package Day1;

public class First {

	public static void main(String[] args) {

		int day = 1;

		switch (day) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		default:
			System.out.println("Hi");
		}

		switch (day) {
		case 1 -> System.out.println("First");
		case 2 -> System.out.println("Second");
		default -> System.out.println("Third");

		}

		char c = 'x';

		switch (c) {
		case 'a', 'e', 'i', 'o', 'u':
			System.out.println("It is a vowel");
			break;
		default:
			System.out.println("It is not a vowel");
			break;
		}

//		int i = 0;
//
//		do {
//			System.out.println(i);
//			i++;
//		} while (i < 10);

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		String abc = "";
		for (int i = 1; i <= 5; i++) {
			abc += "* ";
			System.out.println(abc);
		}

		char a = 'a';

		for (char ch = 'b'; ch <= 'f'; ch++) {
			System.out.println(ch - 'a');
		}

		int num = 1321;
		int original = num;

		int newnum = 0;
		while (num != 0) {
			int digit = num % 10;
			newnum = newnum * 10 + digit;
			num = num / 10;
		}
		if (original == newnum) {
			System.out.println("Yes it a palindrome");
		} else {
			System.out.println("No it is not a palindrome");
		}

	}

}
