package main.java.coderkim.BOJ.week03.week03_01.goldbachExplorer_6588;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TODO: 다시 풀기...

/**
 @Title 골드바흐의 추측(6588)
 @Since 2023.12.28
 @Content
  문제
  1742년, 독일의 아마추어 수학가 크리스티안 골드바흐는 레온하르트 오일러에게 다음과 같은 추측을 제안하는 편지를 보냈다.

  4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다.
  예를 들어 8은 3 + 5로 나타낼 수 있고, 3과 5는 모두 홀수인 소수이다.
  또, 20 = 3 + 17 = 7 + 13, 42 = 5 + 37 = 11 + 31 = 13 + 29 = 19 + 23 이다.

  이 추측은 아직도 해결되지 않은 문제이다.
  백만 이하의 모든 짝수에 대해서, 이 추측을 검증하는 프로그램을 작성하시오.

  입력
  입력은 하나 또는 그 이상의 테스트 케이스로 이루어져 있다. 테스트 케이스의 개수는 100,000개를 넘지 않는다.
  각 테스트 케이스는 짝수 정수 n 하나로 이루어져 있다. (6 ≤ n ≤ 1000000)
  입력의 마지막 줄에는 0이 하나 주어진다.

  출력
  각 테스트 케이스에 대해서, n = a + b 형태로 출력한다. 이때, a와 b는 홀수 소수이다.
  숫자와 연산자는 공백 하나로 구분되어져 있다.
  만약, n을 만들 수 있는 방법이 여러 가지라면, b-a가 가장 큰 것을 출력한다.
  또, 두 홀수 소수의 합으로 n을 나타낼 수 없는 경우에는 "Goldbach's conjecture is wrong."을 출력한다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> primes = generatePrimes(1000000);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            boolean found = false;
            int a = 0;
            int b = 0;

            // 두 홀수 소수의 합으로 n을 나타내기 위해, 더 작은 소수부터 시작하여 가능한 경우를 찾음
            for (int prime1 : primes) {
                int prime2 = n - prime1;

                // prime2가 소수 목록에 있고, 두 홀수 소수의 차이가 현재까지의 최대 차이보다 크다면 갱신
                if (primes.contains(prime2) && prime2 - prime1 >= a - b) {
                    a = prime1;
                    b = prime2;
                    found = true;
                }
            }

            if (found) {
                System.out.println(n + " = " + a + " + " + b);
            } else {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }

        sc.close();
    }

    // 에라토스테네스의 체를 사용하여 주어진 범위 내의 소수를 생성
    public static List<Integer> generatePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }


}
