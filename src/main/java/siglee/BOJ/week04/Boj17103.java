package siglee.BOJ.week04;

import java.io.*;
import java.util.*;

public class Boj17103 {
    static boolean[] prime = new boolean[1000001];
    static List<Integer> indexList = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        aux();
        int index = Integer.parseInt(br.readLine());

        for (int i = 0; i < index; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(getPartition(num));
        }
    }
    //소수 리스트 구현 먼저
    public static void aux(){
        for (int i = 2; i < prime.length - 1; i++) {
            if (prime[i] == false) {
                indexList.add(i);
                for (int j = i + i; j < (prime.length - 1); j += i) {
                    prime[j] = true;
                }
            }
        }
    }

    //짝 찾기
    public static int getPartition(int num) {
        int count = 0;
        for (Integer p : indexList) {
            if (num - p >= 2 && p <= num - p) {
                if (prime[num - p] == false) {
                    count++;
                }
            }
            else{
                break;
            }
        }
        return count;
    }
}
