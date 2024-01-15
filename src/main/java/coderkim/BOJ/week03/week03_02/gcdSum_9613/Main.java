package main.java.coderkim.BOJ.week03.week03_02.gcdSum_9613;

import java.util.Scanner;

/**
 @Title GCD 합(9613)
 @Since 2024.01.05
 @Content 문제
 양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성하시오.

입력
 첫째 줄에 테스트 케이스의 개수 t (1 ≤ t ≤ 100)이 주어진다.
 각 테스트 케이스는 한 줄로 이루어져 있다.
 각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)가 주어지고, 다음에는 n개의 수가 주어진다.
 입력으로 주어지는 수는 1,000,000을 넘지 않는다.

 출력
 각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 출력한다.
 */

public class Main {

    // 최대 입력값이 1,000,000까지의 약수 배열을 생성
    static int[] divisors = new int[1000001];

    // 최대 공약수를 계산하는 메소드
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 첫째 줄에 테스트 케이스의 개수 t (1 ≤ t ≤ 100)이 주어진다.
        int t = sc.nextInt();

        // case 입력은 총 t번 반복
        for (int i = 0; i < t; i++) {
            // 2. 각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)가 주어지고, (n = 각 테스트 케이스의 length)
            int n = sc.nextInt();
            int[] numInCase = new int[n];

            // 3. 다음에는 n개의 수가 주어진다 (각 테스트 케이스에 들어가는 숫자 입력)
            for (int j = 0; j < n; j++) {
                numInCase[j] = sc.nextInt();
            }

            // GCD 계산 및 약수 배열 초기화
            long gcdSum = 0;
            for (int x = 0; x < n; x++) {
                for (int y = x + 1; y < n; y++) {
                    int commonDivisor = gcd(numInCase[x], numInCase[y]);
                    gcdSum += commonDivisor;
                }
            }

            // 4. 각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합 결과 출력
            System.out.println(gcdSum);
        }
        sc.close();
    }
}