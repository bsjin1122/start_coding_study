package main.java.coderkim.BOJ.week03.week03_01.factorial_10872;

import java.util.Scanner;

/**
 @Title 팩토리얼(10872)
 @Since 2023.12.28
 @Content
 문제
 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

 입력
 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.

 출력
 첫째 줄에 N!을 출력한다.

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // input!을 출력한다(N!을 출력한다)
        System.out.println(factorial(input));

        sc.close();

    }

    // 팩토리얼을 계산하는 메소드
    public static int factorial(int input){
        int value = 1;
        for(int i = 1; i <= input; i++){
            value *= i;
        }
        return value;
    }
}
