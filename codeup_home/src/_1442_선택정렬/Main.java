package _1442_선택정렬;

import java.util.Iterator;
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
			int min = i;
			
			for (int j = i+1; j < a.length; j++) {
				if (a[min]>a[j]) {
					min = j;
				}
			}
			
			int swap = a[i];
			a[i] = a[min];
			a[min] = swap;
			
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
