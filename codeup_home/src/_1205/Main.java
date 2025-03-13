package _1205;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		double[] results = {
				a + b, b + a,
	            a - b, b - a,
	            a * b, b * a,
	            a / b, b / a,
	            Math.pow(a, b),Math.pow(b, a)
		};
		
		double max = results[0];
		for (int i = 0; i < results.length; i++) {
			if(max<results[i])
				max = results[i];
		}
		
		System.out.printf("%.6f%n", max);
		sc.close();
	}
}
