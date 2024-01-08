package src.main.java.dilmah0203.BOJ.Dec.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_팩토리얼 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 1;
        while(n > 0) {
            result *= n;
            n--;
        }
        System.out.println(result);
    }
}
