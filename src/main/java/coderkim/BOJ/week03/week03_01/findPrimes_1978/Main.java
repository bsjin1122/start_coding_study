package main.java.coderkim.BOJ.week03.week03_01.findPrimes_1978;

import java.util.Scanner;

/**
 * @Title 소수찾기(1978)
 * @Since 2023.12.28
 * @Content 문제
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * 입력
 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * 출력
 * 주어진 수들 중 소수의 개수를 출력한다.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 첫 줄에 수의 개수 N이 주어진다
        // N은 배열의 크기
        int[] nums = new int[sc.nextInt()];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            // Scanner 클래스는 기본적으로 공백 문자(공백, 탭, 개행 등)을 기준으로 분리
            // 각 수를 입력 받음
            nums[i] = sc.nextInt();
            // 소수인지 판별
            if (isPrime(nums[i])) {
                // 소수일 때만 카운트
                count++;
            }
        }
        sc.close();

        System.out.println(count);
    }

    // 소수를 판별하는 메소드
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

