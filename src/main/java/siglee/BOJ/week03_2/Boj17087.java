package siglee.BOJ.week03_2;

import java.io.*;
import java.util.*;

public class Boj17087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        int gcd = 0;
        int[] arr = new int[index];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(Integer.parseInt(st.nextToken()) - start);
        }
        gcd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            gcd = gcd(gcd,arr[i]);
        }

        System.out.println(gcd);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a%b);
    }
}
