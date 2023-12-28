package src.main.java.dilmah0203.BOJ.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_알파벳_개수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            alphabet[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int a : alphabet) {
            sb.append(a).append(' ');
        }
        System.out.println(sb.toString());
    }
}