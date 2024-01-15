package main.java.coderkim.BOJ.week04.week04_01.goldbachPartition_17103;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 @Title 골드바흐 파티션(17103)
 @Since 2024.01.13
 @Content
 문제
 골드바흐의 추측: 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다. (소수 : 1과 자신만 약수로 갖고 있는 수)
 짝수 N을 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 한다. 짝수 N이 주어졌을 때,골드바흐 파티션의 개수를 구해보자.
 두 소수의 순서만 다른 것은 같은 파티션이다.

 입력
 첫째 줄에 테스트 케이스의 개수 T (1 ≤ T ≤ 100)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 N은 짝수이고, 2 < N ≤ 1,000,000을 만족한다.

 출력
 각각의 테스트 케이스마다 골드바흐 파티션의 수를 출력한다.

 */

//TODO: 에라토스테네스 체와 관련된 문제 다시 풀기
public class Main {
    // 에라토스테네스의 체를 사용하여 소수를 구하는 함수
    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    // 골드바흐 파티션 개수를 구하는 함수
    public static int goldbachPartitions(int n, boolean[] isPrime) {
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime[i] && isPrime[n - i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        // 소수 판별을 위한 에라토스테네스의 체 적용
        int maxN = 1000000; // 주어진 최대 N값
        boolean[] isPrime = sieveOfEratosthenes(maxN);

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 짝수 N
            int partitions = goldbachPartitions(N, isPrime);
            System.out.println(partitions);
        }

        sc.close();
    }
}

