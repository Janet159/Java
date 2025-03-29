package _1210;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] arr = {400,340,170,100,70};
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(arr[num1-1]+arr[num2-1] > 500)
			System.out.print("angry");
		else if(arr[num1-1]+arr[num2-1] <= 500)
			System.out.print("no angry");
		

	}
}
