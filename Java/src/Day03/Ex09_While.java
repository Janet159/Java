package Day03;

public class Ex09_While {
	public static void main(String[] args) {
		
		int a = 1;
		
		//while(조건) {반복 실행문}
		//- 반복문에는 반드시 종료조건이 성립하도록 작성해야 한다.
		//- 종료조건이 만족하지 않으면, 무한 루프에 빠진다.
		while (a <= 10) {
			System.out.println(a++ + " ");
			// a = a + 1
			// 복합 대입 연산자
			// a += 1;
			// 증감 연산자
			// a++;
		}
	}
}
