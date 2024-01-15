package main.java.coderkim.BOJ.week05.week05_02.Tiling2xN1_11726;

import java.util.Scanner;

/**
 @Title 2 x N 타일링1(11726)
 @Since 2024.01.14
 @Content
 문제
 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

 아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.

 입력
 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)

 출력
 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 */
//TODO:동적계획법
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        int mod = 10007;

        dp[1] = 1;
        if (n > 1) dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
        }

        System.out.println(dp[n]);
        sc.close();
    }
}
