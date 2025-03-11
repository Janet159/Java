package Day02;

public class Ex05_Long {
	
	
	public static void main(String[] args) {
		
	//int(4bytes: 32bits)	:2^32개: 약 42억 개
	//int 수 표현 범위			:-21억xxx ~ 21억xxx
	
	//long(8bytes: 64bits) : 2^64억 개
	long ln1 = 1000;			//자동 형변환
	long ln2 = 2100000000;		//자동 형변환
	long ln3 = 2200000000L;		//long을 long에 대입한 것
	// ** L을 붙이지 않은면 기본정수는 int타입으로 인식되어 21억을 표현할 수 없다.
	
	System.out.println("ln1 : "+ ln1);
	System.out.println("ln2 : "+ ln2);
	System.out.println("ln3 : "+ ln3);
	
	}
}
