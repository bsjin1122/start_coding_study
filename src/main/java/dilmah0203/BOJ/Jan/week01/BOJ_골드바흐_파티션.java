package src.main.java.dilmah0203.BOJ.Jan.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_골드바흐_파티션 {
    static boolean[] prime = new boolean[1000001];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        prime[0] = prime[1] = true; //소수면 false
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        while (n-- > 0) {
            int num = Integer.parseInt(br.readLine());

            int result  = 0;
            for (int i = 2; i <= num / 2; i++) {
                if (!prime[i] && !prime[num - i]) {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}