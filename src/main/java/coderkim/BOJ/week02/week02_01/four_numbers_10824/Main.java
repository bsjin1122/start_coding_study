package main.java.coderkim.BOJ.week02.week02_01.four_numbers_10824;

import java.util.Scanner;


/**
 @Title 네 수(10824)
 @Since 2023.12.21
 @Contents

 문제
 네 자연수 A, B, C, D가 주어진다. 이때, A와 B를 붙인 수와 C와 D를 붙인 수의 합을 구하는 프로그램을 작성하시오.

 두 수 A와 B를 합치는 것은 A의 뒤에 B를 붙이는 것을 의미한다. 즉, 20과 30을 붙이면 2030이 된다.

 입력
 첫째 줄에 네 자연수 A, B, C, D가 주어진다. (1 ≤ A, B, C, D ≤ 1,000,000)

 출력
 A와 B를 붙인 수와 C와 D를 붙인 수의 합을 출력한다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        // 문자열 input 을 공백 기준으로 나누어 배열 생성
        String[] inputs = input.split(" ");

        String ab = inputs[0] + inputs[1];
        String cd = inputs[2] + inputs[3];

        // 1,000,000 ≤ A와 B를 붙인 수 + C와 D를 붙인 수의 값일 수 있기 떄문에 long형으로 바꿔준다
        long result = Long.parseLong(ab) + Long.parseLong(cd);
        System.out.println(result);
    }
}
