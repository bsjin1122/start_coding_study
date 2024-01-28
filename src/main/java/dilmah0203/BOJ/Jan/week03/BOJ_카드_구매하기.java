package src.main.java.dilmah0203.BOJ.Jan.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_카드_구매하기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 구매하려고 하는 카드의 개수
        int[] array = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[n + 1]; // n개의 카드를 구매하기 위해 지불해야 하는 최대값
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[i] = Math.max(array[j] + result[i - j], result[i]);
            }
        }
        System.out.println(result[n]);
    }
}
