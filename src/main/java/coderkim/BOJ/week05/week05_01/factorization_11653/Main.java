package main.java.coderkim.BOJ.week05.week05_01.factorization_11653;
import java.util.Scanner;
/**
 @Title 소인수분해(11653)
 @Since 2024.01.15
 @Content
 문제
 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

 입력
 첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.

 출력
 N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N == 1) {
            // N이 1인 경우 아무것도 출력하지 않음
        } else {
            int divisor = 2; // 시작 소수로 2부터 시작
            while (N > 1) {
                if (N % divisor == 0) {
                    // N이 현재의 divisor로 나누어떨어지면 소인수임
                    System.out.println(divisor);
                    N /= divisor;
                } else {
                    // 나누어떨어지지 않으면 다음 소수로 넘어감
                    divisor++;
                }
            }
        }

        sc.close();
    }
}
