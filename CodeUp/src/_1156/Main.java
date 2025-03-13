package _1156;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char c = sc.next().charAt(0);
		int b = sc.nextInt();
	
		sc.nextLine(); // 남아 있는 엔터 제거
		
		switch (c) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		default:
			break;
		}
		
		}
	}
	

