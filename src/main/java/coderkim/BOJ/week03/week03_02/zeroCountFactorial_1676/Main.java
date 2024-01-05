package main.java.coderkim.BOJ.week03.week03_02.zeroCountFactorial_1676;

import java.util.Scanner;

/**
 @Title 팩토리얼 0의 개수(1676)
 @Since 2024.01.03
 @Content

 문제
 N!(연산값이)에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.

 입력
 첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)

 출력
 첫째 줄에 구한 0의 개수를 출력한다.

 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int output = 0;

        // for문과 while문을 이용한 방법은 숫자가 클 때 너무 성능이 떨어지기 때문에
        // 아래와 같은 방법으로 해결했다

        // 5의 개수를 센다
        // 모든 홀수 숫자에는 2가 하나씩 들어가기 때문에 2의 개수는 항상 5보다 많다
        // 따라서 0의 개수는 2와 5의 곱의 개수로 생성되며, 2의 개수는 항상 5보다 많기 때문에 5의 개수로 센다
        for(int i = 5; i <= input; i *=5){
            output += input / i;
        }

        System.out.println(output);

        sc.close();
    }
}
