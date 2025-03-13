package _1231;

import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수: ");
		double num = sc.nextDouble();
		
		System.out.println(num);
		System.out.printf("%f, %f \n", num, 3.14);
		
		System.out.printf("%.2f", num);
		
		sc.close();
	}

}
