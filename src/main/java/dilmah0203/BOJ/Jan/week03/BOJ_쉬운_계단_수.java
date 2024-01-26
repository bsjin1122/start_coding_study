package src.main.java.dilmah0203.BOJ.Jan.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_쉬운_계단_수 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n + 1][10]; // dp[i][j] : 길이가 i이고 j로 시작하는 계단 수의 개수

        for (int i = 1; i <= 9; i++) { // dp[1][0] = 0;
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dp[i][0] = dp[i - 1][1] % 1000000000;
                } else if (j == 9) {
                    dp[i][9] = dp[i - 1][8] % 1000000000;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
                }
            }
        }

        long result = 0;
        for (int i = 0; i < 10; i++) {
            result += dp[n][i];
        }
        System.out.println(result % 1000000000);
    }
}