package src.main.java.dilmah0203.BOJ.Jan.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_소인수분해 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb  = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            while ((n % i) == 0) {
                sb.append(i).append('\n');
                n /= i;
            }
        }
        System.out.println(sb.toString());
    }
}
