package _1162;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if((a - b + c) % 10 == 0)
			System.out.println("대박");
		else
			System.out.println("그럭저럭");
		sc.close();
	}
}
