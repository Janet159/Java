package _1228;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		
		double c = (a-100)*0.9;
		double d = (b-c)*100/c;
		
		if(d<=10)
			System.out.print("정상");
		if(d>10 && d<=20)
			System.out.print("과체중");
		if(d>20)
			System.out.print("비만");
	}
}
