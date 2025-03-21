package _1357;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		
		for (int i = 1; i <= a; i++) {
			System.out.print("*".repeat(count+1));
			count++;
			System.out.println();
		}
		for (int i = 1; i <= a-1; i++) {
			System.out.print("*".repeat(count-1));
			count--;
			System.out.println();
		}
		
	}
}
