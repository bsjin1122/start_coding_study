package siglee.BOJ.week04_2;

import java.io.*;
import java.util.*;

public class Boj11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] check = new boolean[10000001];
        List<Integer> prime = new ArrayList<>();

        //에라스토네의 체 구현
        for (int i = 2; i < check.length; i++) {
            if (check[i] == false) {
                prime.add(i);
                for (int j = i + i; j< check.length; j += i) {
                    check[j] = true;
                }
            }
        }
        int num = Integer.parseInt(br.readLine());

        while (num != 1) {
            for (int i = 0; i < prime.size(); i++) {
                if (num % prime.get(i) == 0) {
                    System.out.println(prime.get(i));
                    num /= prime.get(i);
                    break;
                }
            }
        }
    }

}
