package _1226;


public class Main {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int[] arr = new int[6];
		int bonus = (int)(Math.random()*50+1);
		int[] arr2 = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
		}
		System.out.println();
		
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = (int)(Math.random()*50)+1;
		}
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.print(bonus);
		System.out.println();
		for (int num : arr2) {
			System.out.print(num + " ");
			
		}
		
		for (int k = 0; k < arr.length; k++) {
			for (int k2 = 0; k2 < arr2.length; k2++) {
				
				if(arr[k] == arr2 [k2]) {
					a++;
				}
			}
			
		}
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i] == bonus)
				b = 1;
		}
		
		System.out.println();
		System.out.print(a);
		System.out.println();
		
		if(a == 6)
			System.out.print("1등");
		else if(a == 5 && b == 1)
			System.out.print("2등");
		else if(a == 5)
			System.out.print("3등");
		else if(a == 4)
			System.out.print("4등");
		else if(a == 3)
			System.out.print("5등");
		else if(a == 2)
			System.out.print("0등");
		
		
	}
	
	
}
