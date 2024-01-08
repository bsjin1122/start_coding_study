package src.main.java.dilmah0203.BOJ.Jan.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_진법_변환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String s = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
               result = result * b + (s.charAt(i) - '0');
           } else {
               result = result * b + (s.charAt(i) - 'A' + 10);
           }
        }
        System.out.println(result);
    }
}
