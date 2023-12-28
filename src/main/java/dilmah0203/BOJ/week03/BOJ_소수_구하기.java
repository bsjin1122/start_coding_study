package src.main.java.dilmah0203.BOJ.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_소수_구하기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[1000001];
        prime[0] = true;
        prime[1] = true; //소수면 false
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            for (int j = i + i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        for (int i = a; i <= b; i++) {
            if (!prime[i]) {
                System.out.println(i);
            }
        }
    }
}
