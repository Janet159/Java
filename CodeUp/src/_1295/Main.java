package _1295;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] charArray = str.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if(Character.isUpperCase(ch)) {
				charArray[i] = Character.toLowerCase(ch);
			}
			else {
				charArray[i] = Character.toUpperCase(ch);
			}
		}
			for (char c : charArray) {
				System.out.print(c);
				
			}
			sc.close();
		}
	}
