package src.main.java.dilmah0203.BOJ.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_골드바흐의_추측 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] prime = new boolean[1000001];
        prime[0] = true;
        prime[1] = true; //소수면 false
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            for (int j = i + i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        int num = 1;
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            num = Integer.parseInt(br.readLine());
            for (int i = 2; i <= num; i++) {
                if (!prime[i] && i % 2 == 1) {
                    if (!prime[num - i]) {
                        sb.append(num).append(' ').append('=').append(' ').append(i).
                                append(' ').append('+').append(' ').append(num - i);
                        sb.append('\n');
                        break;
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}