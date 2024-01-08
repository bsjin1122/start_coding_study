package src.main.java.dilmah0203.BOJ.Jan.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8진수_2진수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String str[] = {"000", "001", "010", "011", "100", "101", "110", "111"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - '0'; //3
            sb.append(str[a]);
        }

        if(s.equals("0")) {
            System.out.println(s);
        } else {
            while (sb.charAt(0) == '0') {
                sb = new StringBuilder(sb.substring(1, sb.length()));
            }
            System.out.println(sb.toString());
        }
    }
}
