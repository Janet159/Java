package Day07.UpCasting;

public class Person {
	String name;
	int age = 10;
	
	void work() {
		System.out.println("일을 합니다.");
	}
}
class Student extends Person{
	String major;
	int age = 20;
	
	void work() {
		System.err.println("공부합니다.");
	}
}


