package _1356;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			System.out.print("*");
		}

		System.out.println();
		
		for (int i = 0; i < a-2; i++) {
			
			System.out.print("*");
			for (int j = 0; j < a-2; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}

		
		
		for (int k = 1; k <= a; k++) {
			System.out.print("*");
		}
		
	}
}
