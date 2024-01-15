package main.java.coderkim.BOJ.week01.week01_01;

import java.util.Scanner;
import boj_week1_01.Solution;

/**
  @Since 2023.12.16 토
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        // 단어 뒤집기
        // String S = sc.nextLine();
        // String result = solution.reverseWords(S);

        // 쇠 막대기
        // String S = sc.nextLine();
        // int result = solution.cuttingsSticks(S);
        // System.out.println(result);

        // 오큰수 ,오등큰수
        int length = sc.nextInt();

        int[] A = new int[length];

        for(int i = 0; i < length; i++){
            A[i] = sc.nextInt();
        }

        // 오큰수
 //       solution.findNGE(A);
        // 오등큰수
        solution.findNGF(A);

    }
}
