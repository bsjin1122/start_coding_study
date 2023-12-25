package main.java.coderkim.BOJ.week02.week02_02.remainder_10430;

import java.util.Scanner;

/**
 @Title 나머지(10430)
 @Since 2023.12.25
 @Content
 문제
 (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?

 (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?

 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

 입력
 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

 출력
 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A, B, C 입력
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // (A+B)%C 계산
        int result1 = (A + B) % C;

        // ((A%C) + (B%C))%C 계산
        int result2 = ((A % C) + (B % C)) % C;

        // (A×B)%C 계산
        int result3 = (A * B) % C;

        // ((A%C) × (B%C))%C 계산
        int result4 = ((A % C) * (B % C)) % C;

        // 결과 출력
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        sc.close();
    }
}
