package Day09.Ex02_Wrapper;


import java.util.Scanner;

public class BooleanEx {

	public static void main(String[] args) {
		// Boolean
		// boolean -> Boolean
		// : 불타입인 boolean 기본타입을 객체화한 클래스
		Integer i = 100;
		Boolean b = (i < 40);
		System.out.println( Boolean.toString(b) + "입니다.");		// false 	->	"false"
		System.out.println( Boolean.parseBoolean("false"));		// "false" 	-> 	false
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		boolean check = Boolean.parseBoolean( sc.nextLine() );		//대문자도 boolean타입으로 변환을 잘 해준다
		if( check ) {
			System.out.println("\"true\" 를 입력하였습니다.");
		}
		else {
			System.out.println("\"true\" 가 아닙니다.");
		}
		sc.close();
	}
}





