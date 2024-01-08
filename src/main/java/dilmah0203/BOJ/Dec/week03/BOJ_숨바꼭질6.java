package src.main.java.dilmah0203.BOJ.Dec.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_숨바꼭질6 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = sc.nextLong(); //수빈이 위치
        long[] array = new long[n]; //동생 위치
        for (int i = 0; i < n; i++) {
            long location = s - sc.nextLong();
            if (location < 0) {
                location *= -1;
            }
            array[i] = location;
        }

        Arrays.sort(array);
        long result = array[0];
        for (int i = 1; i < n; i++) {
            result = getGCD(result, array[i]);
        }
        System.out.println(result);
    }

    public static long getGCD(long a, long b) {
        while (b != 0) {
            long c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
