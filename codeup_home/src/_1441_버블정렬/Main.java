package _1441_버블정렬;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int swap = a[j];
					a[j] = a[j+1];
					a[j+1] = swap;
				}
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	
}
}