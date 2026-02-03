package Day3;

public class Student {
	int RollNo;
	String Name;
	int Marks;

	static int j;
	static String collegeName;

	void details() {
		System.out.println("Student name is : " + Name + " having Roll No : " + RollNo + " got marks : " + Marks);
		System.out.println("College Name of Student is : " + collegeName);
	}

	public static void main(String[] args) {

		collegeName = "Chitkara";

		Student s1 = new Student();
		s1.Name = "Vishesh";
		s1.RollNo = 2916;
		s1.Marks = 100;

		s1.details();

		Student s2 = new Student();
		s2.details();

		System.out.println(Student.j); // another method to call static using class name

	}

}
