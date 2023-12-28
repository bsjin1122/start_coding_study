package src.main.java.dilmah0203.BOJ.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_최대공약수와_최소공배수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int num = a * b;
        while(b != 0) { //최대공약수
            int c = a % b;
            a = b;
            b = c;
        }

        System.out.println(a);
        System.out.println(num / a);
    }
}
