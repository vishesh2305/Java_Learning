package Day2;

public class Second {

	int i = 100; // Instance or non-static variable , instance variable belong to object and it
					// will be allocated inside the heap area.

	static int j = 200; // static / class level variables. Inside the Method area.

	void fun1() {
		System.out.println("inside fun1 of Demo class");
	}

	static void fun2() {
		System.out.println("inside fun2 of Demo class");
	}

	public static void main(String[] args) {
		int x = 10; // It is a local variable, local variable is stored in stack memory .
//		System.out.println(i); Non static field can not be called inside a static field
		System.out.println(j);

		fun2(); // STATIC FUNCTION CAN BE CALL DIRECTLY

//		fun1(); // Non static function cannot be called

		Second pSecond = new Second();

		pSecond.i = 20;

		System.out.println(pSecond.i);

		// When we change the value of a variable by object , then it only changes for
		// the current object not for all objects.

		Second p = new Second();
		System.out.println(p.i);

	};

}
