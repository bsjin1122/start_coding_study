package siglee.BOJ.week05_1;

import java.util.*;
import java.io.*;

public class Boj1463 {


    /*
     * 1. 변수 판단
     *   1-1. 배열을 int로 만든다 최대 값이 나오더라도 최소 연산 값이 int의 범위보다 작기 때문에 상관 없어 보인다.
     * 2. 초기화
     *   2-1. 배열의 초기화만 하는데 배열을 static 으로 만들어서 파라미터를 줄여준다.
     * 3. 검증 로직 필요한가?
     *   3-1. 검증 로직 필요하다
     *          * 검증은 간단하게 Math.min()를 이용해서 검증할 예정이다.
     *
     * 수도코드 작성
     * 1. 입력을 받아 초기화 하는 것을 한다. (백준에서 언제나 해왔던것들)
     * 2. dp 메서드를 하나 만들어준다.
     *   2-1. 일단 2의 배수인지 3의 배수인지 6의 배수인지 확인하는 메서드가 필요
     *       2-1-1. 2의 배수
     *              2로 나눈 index 값과 -1한 값을 비교해서 최소 값을 찾는다.
     *       2-1-2. 3의 배수
     *               3으로 나눈 index -1한 index 비교해서 최소 값 찾기
     *       2-1-3. 6의 배수
     *               2로 나눈 값 3으로 나눈값 -1한 값 3개로 비교
     *   2-2. 연산을 할때 마지막에 1을 더해줘야한다 Why? 하나의 연산을 우리가 직접 처리하기 때문이다.
     * 재귀를 사용해야할 것 같다.
     *
     * */
    static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        memo = new int[N + 1];
        if (N >= 3) {
            memo[3] = 1;
        } else if (N >= 2) {
            memo[2] = 1;
        }

        int result = dp(N);
        System.out.println(result);
    }

    public static int dp(int N) {
//        System.out.println("N = " + N);
        //탈출 조건
        if (N > 1 && memo[N] == 0) {

            if (N % 6 == 0) {
                memo[N] = Math.min(Math.min(dp(N / 2), dp(N / 3)), dp(N - 1)) + 1;
            } else if (N % 3 == 0) {
                memo[N] = Math.min(dp(N / 3), dp(N - 1)) + 1;
            } else if (N % 2 == 0) {
                memo[N] = Math.min(dp(N / 2), dp(N - 1)) + 1;
            } else {
                memo[N] = dp(N - 1) + 1;
            }
        }
        return memo[N];
    }
}


