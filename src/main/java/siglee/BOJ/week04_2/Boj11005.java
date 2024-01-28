package siglee.BOJ.week04_2;

import java.util.*;
import java.io.*;
import java.math.*;

public class Boj11005 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int role = Integer.parseInt(st.nextToken());

        //10으로 나눈 나머지가 sb에 들어가게 되며 몫은 다시 sb로 들어가게된다.
        while (num > 0) {
            if (num % role < 10) {
                sb.append(num % role);
            }else
                sb.append((char)('A' + (num % role) - 10));
            num /=role;
        }
        System.out.println(sb.reverse());
    }

}
