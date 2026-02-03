package Day4;

public class StackOverflowError {
	int x = 100;

	StackOverflowError s1 = new StackOverflowError();

	public static void main(String[] args) {
		StackOverflowError obj = new StackOverflowError();

		System.out.println(obj.x);

	}

}
