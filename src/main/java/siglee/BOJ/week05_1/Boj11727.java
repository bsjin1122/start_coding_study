package siglee.BOJ.week05_1;

import java.io.*;
import java.util.*;
import java.math.*;

public class Boj11727 {
    static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        memo = new int[N <=1 ? 10 : N + 1];
        memo[1] = 1;
        memo[2] = 3;
        System.out.println(dp(N));
    }

    private static int dp(int N) {
        //탈출 조건
        if (memo[N] != 0) {
            return memo[N];
        }
        //루프 조건
        //2 뺀 값이 있을 경우
        if (N - 2 > 0) {
            memo[N] =  (dp(N - 2) + dp(N - 1) + dp(N - 2)) % 10007;
        }
        //1 뺀 값이 존재할 경우
        else
            memo[N] =  dp(N - 1) % 10007;

        return memo[N];
    }
}
/*
* 2 x n 직사각형을 1x2, 2 x 1, 2 *x 타이로 채우는 방법의 수를 구하시오

첫 줄에 n이 주어진다.
2 * n 크기의 직사각형을 채우는 방법을 10007로 나눈 나머지를 출력한다.
즉 n개의 타일을 채우는 방법을 구하라는 것은
(n - 1 개의 타일을 채우는 경우의 수) + (n - 2 개의 타일을 채우는 경우의수 )+ (n - 2 개를 채우는 경우의 수 )
데이터를 집어 넣을 memo라는 배열을 만들어 값을 미리 넣어둔다.
* 이 때 크게 변화하는 값을 먼저 넣어두는 것이 효과적이다.
* */