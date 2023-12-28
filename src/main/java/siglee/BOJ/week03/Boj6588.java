package siglee.BOJ.week03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Boj6588 {
    static boolean[] prime = new boolean[1000001];
    static List<Integer> primeRealValue = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initPrime();
        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                break;
            }
            aux(num);
        }
    }

    public static void initPrime() {
        prime[0] = prime[1] = true;
        for (int i = 2; i <= 1000000; i++) {
            if (!prime[i]) {
                primeRealValue.add(i);
                for (int j = i + i; j <= 1000000; j += i) {
                    prime[j] = true;
                }
            }
        }
    }


    public static void aux(int num) {
        for (int i = 0; i <= primeRealValue.size(); i++) {
            int p = primeRealValue.get(i);
            if (prime[num - p] == false) {
                System.out.println(num + " = " + p + " + " + (num - p));
                return;
            }
        }
        System.out.println("Goldbach's conjecture is wrong.");
    }


}
