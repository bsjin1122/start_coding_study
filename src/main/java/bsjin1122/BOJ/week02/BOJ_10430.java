package bsjin1122.BOJ.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** @author bsjin
 * @date 2023/12/25
 * @title 백준 10430 나머지
 *
 * 문제
 * (A + B)%C는 ((A%C) + (B%C))%C 와 같을까?
 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
 */

public class BOJ_10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 문자열 S입력
        // 공백을 기준으로 문자열을 분리하여 문자열 배열로 만듭니다.
        String[] strArray = str.split(" ");

        // int 배열을 선언하여 문자열 배열을 int로 변환하여 담습니다.
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        int a = intArray[0];
        int b = intArray[1];
        int c = intArray[2];

        System.out.println((a+b)% c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)* (b%c))%c);
    }
}
