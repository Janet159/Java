package _1231;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int num = sc.nextInt();
			
			if(num % 2 == 1) 
				System.out.println("odd");
			
			else if(num % 2 == 0) 
				System.out.println("even");
			
			sc.close();
	}
}
