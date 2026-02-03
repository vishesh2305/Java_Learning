package Day4;

public class Demo {
	static int x = 100;

	static A a1 = new A();

	void funcX() {
		System.out.println("Inside funX of Demo");
	}

	public static void main(String[] args) {
		System.out.println(Demo.x); // 100

		System.out.println(Demo.a1); // A class Object address

		Demo.a1.funA(); // a1 is object of class A and calling the funA() function .

		System.out.println(); // similarly out is a method of print class and calling the function println()
								// from that class itself.
		// Out is a static variable of system class .
	}
}
