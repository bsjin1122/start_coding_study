package main.java.coderkim.BOJ.week02.week02_02.gcdlcm_2609;

import java.util.Scanner;

/**
 @Title 최대공약수와 최소공배수(2609)
 @Since 2023.12.25
 @Content
 문제
 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

 입력
 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

 출력
 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // 입력
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // 최대공약수 계산
        int gcdResult = gcd(num1, num2);

        // 최소공배수 계산
        int lcmResult = lcm(num1, num2);

        // 결과 출력
        System.out.println(gcdResult);
        System.out.println(lcmResult);

        sc.close();
    }


    // 최대공약수를 계산하는 메소드
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수를 계산하는 메소드
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
