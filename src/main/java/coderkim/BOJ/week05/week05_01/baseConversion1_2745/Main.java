package main.java.coderkim.BOJ.week05.week05_01.baseConversion1_2745;

import java.util.Scanner;

/**
 @Title 진법변환(2745)
 @Since 2024.01.15
 @Content
 문제
 B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.

 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

 A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

 입력
 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)

 B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.

 출력
 첫째 줄에 B진법 수 N을 10진법으로 출력한다.

 */

// 내장메소드를 이용한 방법
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // B진법 수 N이 주어진다.
        // 입력 : 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
        // N , B를 입력
        String input = sc.nextLine();
        String[] inputs = input.split(" ");

        String N = inputs[0];
        int B = Integer.parseInt(inputs[1]);

        int decimalValue = Integer.parseInt(N,B);

        System.out.println(decimalValue);
        sc.close();

    }
}
