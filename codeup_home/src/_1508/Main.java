package _1508;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		
		for (int k = 0; k < N; k++) {
			arr[k] = sc.nextInt();
		}
		
		for (int value : arr) {
			System.out.print(value + " ");
		}
				
		
		sc.close();
	}
}
