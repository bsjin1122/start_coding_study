package siglee.BOJ.week05_1;

import java.util.*;
import java.io.*;

public class Boj9095 {


    static int[] memo = new int[12];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 4;
        for (int i = 0; i < N; i++) {
            Integer result = dp(Integer.parseInt(br.readLine()));
            System.out.println(result);
        }
    }

    public static int dp(int n) {
        if (memo[n] != 0) {
            return memo[n];
        }
        if (n > 3) {
            return dp(n - 3) + dp(n - 2) + dp(n - 1);
        }
        if (n > 2) {
            return dp(n - 2) + dp(n - 1);
        }
        if (n > 1) {
            return dp(n - 1);
        }
        return memo[n];
    }
}

