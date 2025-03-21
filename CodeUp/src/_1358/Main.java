package _1358;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 1; i <=a; i+=2) {
			int spaces = (a-i)/2;
			System.out.print(" ".repeat(spaces));
			System.out.println("*".repeat(i));
		}
		sc.close();
		
		
		
		
	}
}
