package Day3;

public class first {

	int i;

	void fun1() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {

		first f1 = new first();

		f1.i = 50;

		System.out.println(f1.i);

		f1 = null;
//		System.out.println(f1.i); // it will give error , as after referencing as null , then the link of object from Context part with the Heap Area gets terminated . 

		first f2 = new first(); // This method will stay in the heap memory .
		f2.fun1();

		new first().fun1(); // It terminates as soon as the function work is complete .
	}

}