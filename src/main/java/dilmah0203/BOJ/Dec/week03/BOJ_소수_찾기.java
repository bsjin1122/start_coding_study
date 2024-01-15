package src.main.java.dilmah0203.BOJ.Dec.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_소수_찾기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] array = new int[t];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            if (array[i] == 1) {
                continue;
            }
            if(isPrime(array[i])) {
                result++;
            }
        }

        System.out.println(result);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
