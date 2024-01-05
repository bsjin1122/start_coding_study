package main.java.coderkim.BOJ.week03.week03_02.zeroCountInCombination_2004;

import java.util.Scanner;

/**
  @Title 조합 0의 개수(2004)
  @Since 2024.01.03
  @Content
  문제
  (n
  m)의 끝자리 0의 개수를 출력하는 프로그램을 작성하시오.

  입력
  첫째 줄에 정수 n,m (0 ≤  m ≤ n ≤ 2,000,000,000, n ≠ 0) 이 들어온다

  출력
  첫째 줄에
  (n
  m)의 끝자리 0의 개수를 출력한다.
 */
// 1번 코드
public class Main {

    public static void main(String[] args) throws Exception {
        /** 조합 공식:

         (n    =   n!/ m!(n−m)!
         m)                    */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 0은 2 * 5로 생겨남
        // 조합은 nCm을 계산할 때, n!을 m!과 (n-m)!로 나누면서 중복되는 2와 5의 인수를 제거하기 때문에
        // 2와 5를 둘 다 고려 해야 함
        // 더 적은 경우가 0의 개수

        // 2로 0의 개수를 count 할 때
        int caseNumTwo = zeroCount(n,2) - zeroCount(m,2) - zeroCount(n-m,2);
        // 5로 0의 개수를 count 할 때
        int caseNumFive = zeroCount(n,5) -zeroCount(m,5) - zeroCount(n-m,5);

        /**
         (n
         m)의 끝자리 0의 개수*/;
         //더 작은 경우의 수
        int result = Math.min(caseNumTwo,caseNumFive);
        System.out.println(result);
        sc.close();
    }

    // factorial 0의 개수를 카운팅 하는 메소드
    // 2 또는 5로 나누어 떨어지는 수의 개수를 카운팅
    static Integer zeroCount(int num,int divisor) {
        int count = 0;

        /**while문**/

        // num이 2 또는 5보다 더 작아질 때까지 반복
        while (num >= divisor) {
            count += num / divisor;
            num /= divisor;
        }


        /**for문으로 할 때는 i의 값이 계속 증가하여 오버플로우 될 수 있으므로 long형으로 해야한다 **/
        // i가 num보다 커질 때까지 반복

        // (1) 오버 플로우가 나는 예시 코드
//        for (int i = divisor; i <= num; i *= divisor) {
//            count += num / i;
//        }

        // (2) 오버 플로우가 안 나도록 long형으로 수정한 코드
//        for (long i = divisor; i <= num; i *= divisor) {
//            count += num / i;
//        }

        return count;
    }
}