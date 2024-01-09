package siglee.BOJ.week03_2;

import java.io.*;
import java.util.*;

public class Boj1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int num = Integer.parseInt(br.readLine());

        for (int i = 5; i <= num; i *= 5) {
            sum = sum + (num/i);
        }
        System.out.println(sum);
    }
}
