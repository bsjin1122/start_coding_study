package src.main.java.dilmah0203.BOJ.Dec.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_최소공배수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int num = a * b;
            System.out.println(num / getGCD(a, b));
        }
    }

    public static int getGCD(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
