package src.main.java.dilmah0203.BOJ.Dec.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_조합_0의_개수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken()); //입력값이 20억이 최대이므로(int는 21억까지)

        long five = count(5, n) - count(5, m) - count(5, (n - m));
        long two = count(2, n) - count(2, m) - count(2, (n - m));
        /**
         * 끝자리 0의 개수는 2와 5의 개수에 의해 결정되는데,
         * 두개 모두 존재해야 하기 때문에 최소값을 찾는다.
         */
        long result = Math.min(five, two);
        System.out.println(result);
    }

    public static long count(int divide, long num) {
        long count = 0;
        while (num >= divide) {
            count += num / divide;
            num /= divide;
        }
        return count;
    }
}

