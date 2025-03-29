package _1443_삽입정렬;

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
		
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			
			while (a[j]>key) {
				a[j+1] = a[j];

				j--;
			}
			
			a[j+1] = key;
			
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
