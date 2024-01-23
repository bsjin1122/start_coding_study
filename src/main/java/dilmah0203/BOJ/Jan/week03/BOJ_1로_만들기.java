package src.main.java.dilmah0203.BOJ.Jan.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1로_만들기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1]; // n을 1로 만들기 위한 연산의 최소값 저장
        dp[0] = dp[1] = 0;

        // 10의 경우 10 -> 9 -> 3 -> 1
        // 9의 경우 9 -> 3 -> 1 이전의 9가 이미 최소 횟수를 구해놨기 때문에 최소횟수 + 1을 하면 해당 숫자의 최소횟수를 구할 수 있다.
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + 1; // 1을 더하는 연산

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 1을 더하는 연산을 한 후 연산횟수와 2를 나누는 연산 중 작은 횟수
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}
