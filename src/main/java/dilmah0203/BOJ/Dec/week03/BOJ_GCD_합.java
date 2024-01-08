package src.main.java.dilmah0203.BOJ.Dec.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BOJ_GCD_합 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        /**
         * 수의 개수 최대는 100개, 수의 최대는 1000000
         * 나올 수 있는 조합의 최대 개수는 C(100,2) = 100! / 2!(100−2)!이므로,
         * 1000000 * 4950 -> int, long 범위 초과
         */
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int[] array = new int[n];

            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(st.nextToken());
            }

            BigInteger result = combination(array);
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static BigInteger combination(int[] array) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                BigInteger gcd = BigInteger.valueOf(getGCD(array[i], array[j]));
                sum = sum.add(gcd);
            }
        }
        return sum;
    }

    public static int getGCD(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
