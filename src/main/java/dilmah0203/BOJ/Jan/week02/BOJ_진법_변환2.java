package src.main.java.dilmah0203.BOJ.Jan.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_진법_변환2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int temp = num % b;
            if (temp < 10) {
                sb.append((char)(temp + '0'));
            } else {
                sb.append((char)(temp - 10 + 'A'));
            }
            num /= b;
        }
        System.out.println(sb.reverse());
    }
}