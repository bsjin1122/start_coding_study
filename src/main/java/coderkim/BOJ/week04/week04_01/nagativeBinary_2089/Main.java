package main.java.coderkim.BOJ.week04.week04_01.nagativeBinary_2089;

import java.util.Scanner;

/**
 @Title -2진법(2089)
 @Since 2024.01.13
 @Content
 문제
 -2진법은 부호 없는 2진수로 표현이 된다.
 2진법에서는 20, 21, 22, 23이 표현 되지만 -2진법에서는 (-2)0 = 1, (-2)1 = -2, (-2)2 = 4, (-2)3 = -8을 표현한다.
 10진수로 1부터 표현하자면 1, 110, 111, 100, 101, 11010, 11011, 11000, 11001 등이다.

 10진법의 수를 입력 받아서 -2진수를 출력하는 프로그램을 작성하시오.

 입력
 첫 줄에 10진법으로 표현된 수 N이 주어진다.

 출력
 -2진법 수를 출력한다.

 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(input);
        if(n == 0){
            sb.append(n);
        }else{
            // 마지막 몫이 1일 떄까지 반복
            while(n != 1){
                // 나머지는 반드시 양수여야 하기 때문에 절대값 반환
                sb.append(Math.abs(n % (-2)));
                n = (int) Math.ceil((double) n / (-2));
            }

            // 마지막 몫이 1일 때의 나머지도 추가 해줘야 함
            sb.append(n);
        }

        // sb를 뒤집어서 출력
        // -2진법 출력
        System.out.println(sb.reverse());
        sc.close();
    }
}
