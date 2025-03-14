package _1226;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 당첨 번호 6개 + 보너스 번호 1개
        int[] arr = new int[7]; // 당첨 번호
        // 지혜가 가지고 있는 로또 번호 6개
        int[] arr2 = new int[6];

        // 당첨 번호 입력 받기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 지혜의 번호 입력 받기
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        // 맞춘 번호 개수 카운트
        int matchCount = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < 6; j++) {  // 당첨 번호의 첫 6개와 비교
                if (arr2[i] == arr[j]) {
                    matchCount++;
                }
            }
        }

        // 보너스 번호 확인
        int bonusNumber = arr[6];
        boolean hasBonus = false;
        if (matchCount == 5) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] == bonusNumber) {
                    hasBonus = true;
                    break;
                }
            }
        }

        // 결과 출력
        if (matchCount == 6) {
            System.out.println(1);  // 1등
        } else if (matchCount == 5 && hasBonus) {
            System.out.println(2);  // 2등 (보너스 번호 포함)
        } else if (matchCount == 5) {
            System.out.println(3);  // 3등
        } else if (matchCount == 4) {
            System.out.println(4);  // 4등
        } else if (matchCount == 3) {
            System.out.println(5);  // 5등
        } else {
            System.out.println(0);  // 꽝
        }

        sc.close();  // Scanner 객체 닫기
    }
}

