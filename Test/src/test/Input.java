package test;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner sc = new Scanner(System.in);

		// 사용자로부터 정수 입력 받기
		System.out.print("정수: ");
		int num = sc.nextInt();

		// 입력 받은 정수 출력
		System.out.println("입력된 정수는 " + num + "입니다");

	
		// Scanner 닫기
		sc.close();
			
	}

}
