package src.main.java.dilmah0203.BOJ.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_알파벳_찾기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (alphabet[c - 'a'] == -1) {
                alphabet[c - 'a'] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alphabet.length; i++) {
            sb.append(alphabet[i]).append(' ');
        }
        System.out.println(sb.toString());
    }
}
