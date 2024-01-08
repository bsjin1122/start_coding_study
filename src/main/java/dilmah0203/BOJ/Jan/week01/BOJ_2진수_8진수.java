package src.main.java.dilmah0203.BOJ.Jan.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2진수_8진수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        if (s.length() % 3 == 0) {
            s += "";
        } else if(s.length() % 3 == 1) {
            s = "00" + s;
        } else {
            s = "0" + s;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i -= 3) {
            int a = (s.charAt(i) - '0') * 1;
            int b = (s.charAt(i - 1) - '0') * 2;
            int c = (s.charAt(i - 2) - '0') * 4;
            sb.append(a + b + c);
        }
        System.out.println(sb.reverse());
    }
}