package bsjin1122.BOJ.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_1934 {
    /**
     * @author bsjin
     * @date 2023/12/25
     * @title 백준 1934 최소공배수
     *
     * 문제
     * 두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다.
     * 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
     * 두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
     *
     * 입력: 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)
     * 출력: 첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.
     */
    public static void main(String[] args) throws IOException {
        // 입력은 InputStreamReader를 통해 '문자'를 'char'타입으로 byte단위로 받는다(InputStream 객체로)
        // 받은 'char'타입 문자들을 BufferedReader를 통해 직렬화('String'타입으로 변환)한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받은 문자열을 Intger 데이터타입으로 변환한다.(기본형 String)
        int N = Integer.parseInt(br.readLine());

        // 문자들을 입력받아 String을 만들 StringBuilder선언
        // String은 불변의 객체이기 때문에 새로만들거나 합칠때마다
        // 새로운 문자열을 참조하기에 비효율적이다.
        StringBuilder sb = new StringBuilder();

        // String을 delim(delimiter)으로 분리하여 토큰화합니다.
        // delim으로는 기본적인 공백문자인 \t(가로탭), \n(줄바꿈), \r(캐리지 리턴) 등이 있습니다.
        StringTokenizer st;

        for(int i = 0; i < N; i++) {
            // 공백 기준으로 토큰화(한번에 입력받음)
            st = new StringTokenizer(br.readLine(), " ");

            // String토큰들을 Intger로 형변환
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 정적메소드 gcd 실행결과인 최대공약수를 d변수에 입력
            int d = gcd(a, b);

            // 유클리드 호제법 사용
            // 결과를 StringBuilder에 입력하고 줄바꿈을 붙인다.
            sb.append(a * b / d).append('\n');
        }
        // 반복문 종료후 결과값들이 들어있는 sb출력
        System.out.println(sb);

    }

    // 최대공약수 반복문 방식
    public static int gcd(int a, int b) {

        while (b != 0) {
            int r = a % b; // 나머지를 구해준다.

            // GCD(a, b) = GCD(b, r)이므로 변환한다.
            a = b;
            b = r;
        }
        return a;
    }

}
