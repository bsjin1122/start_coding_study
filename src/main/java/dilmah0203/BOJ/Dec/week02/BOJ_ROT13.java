package src.main.java.dilmah0203.BOJ.Dec.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_ROT13 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c += 13;
                if (c > 'z') {
                    int temp = c - ('z' + 1);
                    c = (char) (temp + 97);
                }
            }
            if (c >= 'A' && c <= 'Z') {
                c += 13;
                if (c > 'Z') {
                    int temp = c - ('Z' + 1);
                    c = (char) (temp + 65);
                }
            }
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}