package _1205;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		arr[0] = (int)(a + b);
		arr[1] = (int)(a - b);
		arr[2]= (int)(b - a);
		arr[3]= (int)(a * b);
		arr[4]= (int)(a / b);
		arr[5]= (int)(b / a);
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < args.length; i++) {
			if(max<arr[i])
				max = arr[i];
		}
		System.out.printf("%.6f", max);
		
		
		sc.close();
	}
}
