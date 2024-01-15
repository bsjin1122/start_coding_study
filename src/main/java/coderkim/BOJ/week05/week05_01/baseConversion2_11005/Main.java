package main.java.coderkim.BOJ.week05.week05_01.baseConversion2_11005;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 @Title 진법변환2(11005)
 @Since 2024.01.15
 @Content
 문제
 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.

 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

 A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

 입력
 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.

 출력
 첫째 줄에 10진법 수 N을 B진법으로 출력한다.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        int n = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        List<Character> list = new ArrayList<>();
        while (n > 0) {
            if (n % b < 10) {
                list.add((char) (n % b + '0'));
            } else {
                list.add((char) (n % b - 10 + 'A'));
            }
            n /= b;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
        sc.close();
    }
}
//TODO:
// 내장메소드를 이용한 방법... 왜 오류 나지??
    //public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String input = sc.nextLine();
//        String[] inputs = input.split(" ");
//
//        // 10진법 숫자
//        Integer N = Integer.parseInt(inputs[0]);
//        // 변환할 진법 숫자
//        int B = Integer.parseInt(inputs[1]);
//
//        String result = Integer.toString(N,B);
//
//        System.out.println(result);
//
//        sc.close();
//
//    }
//}
