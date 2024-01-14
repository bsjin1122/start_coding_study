package siglee.BOJ.week04_2;

import java.util.*;
import java.io.*;

public class Boj2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int rule = Integer.parseInt(st.nextToken());
        int tmp = 1;
        int sum = 0;

        for (int i = 0; i < N.length(); i++) {
            char ch = N.charAt(i);

            if (ch <= '9') {
                sum += (ch - '0') * tmp;
            } else {
                sum += (ch - 'A' + 10) * tmp;
            }
            tmp *= rule;
        }

        System.out.println(sum);
    }
}

