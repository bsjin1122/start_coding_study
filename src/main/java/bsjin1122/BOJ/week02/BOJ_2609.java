package bsjin1122.BOJ.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2609 {
    /**
     * @author bsjin
     * @date 2023/12/25
     * @title 백준 2609 최대공약수와 최소공배수
     *
     * 문제
     * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
     * 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
     */
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

        System.out.println(gcd(intArray[0], intArray[1]));
        System.out.println(lcm(intArray[0], intArray[1]));


    }
    public static int gcd(int a, int b) { // 최대공약수
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
 
    public static int lcm(int a, int b) { //최소공배수
        return (a * b) / gcd(a, b);
    }
}
