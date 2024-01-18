package siglee.BOJ.week05_1;

import java.util.*;
import java.io.*;

public class Boj11726 {


    static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(dp(N));
    }

    public static int dp(int n) {
        memo = new int[n + 1];

        //1번지 2번지 추가
        memo[1] = 1;
        memo[1] = 1;
        if (n >= 2) {
            memo[2] = 2;
        }

        for (int i = 3; i <= n; i++) {
            memo[i] = (memo[i - 1] + memo[i - 2]) % 10007;
        }
        return memo[n];
    }
}

