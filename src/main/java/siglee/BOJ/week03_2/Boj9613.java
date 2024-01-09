package siglee.BOJ.week03_2;

import java.io.*;
import java.util.*;

public class Boj9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int limit = Integer.parseInt(br.readLine());

        for (int i = 0; i < limit; i++) {
            aux(br);
        }
    }

    private static void aux(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int[] arr = new int[num];
        long sum = 0;

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < num - 1; i++) {
            for (int j = i+1; j < num; j++) {
                sum += gcd(arr[i],arr[j]);
            }
        }
        System.out.println(sum);
    }

    private static int gcd(int a, int b) {
        return  b == 0 ? a : gcd(b,a%b);
    }
}
