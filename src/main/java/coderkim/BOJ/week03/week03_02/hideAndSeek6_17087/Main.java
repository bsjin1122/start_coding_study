package main.java.coderkim.BOJ.week03.week03_02.hideAndSeek6_17087;

import java.util.Scanner;

/**
 @Title 숨바꼭질6(17087)
 @Since 2024.01.05
 @Content
 !!!!!!!!!!!이분탐색!!!!!!(다시 한 번 풀기)
 
 문제
 수빈이는 동생 N명과 숨바꼭질을 하고 있다. 수빈이는 현재 점 S에 있고, 동생은 A1, A2, ..., AN에 있다.

 수빈이는 걸어서 이동을 할 수 있다. 수빈이의 위치가 X일때 걷는다면 1초 후에 X+D나 X-D로 이동할 수 있다. 수빈이의 위치가 동생이 있는 위치와 같으면, 동생을 찾았다고 한다.

 모든 동생을 찾기위해 D의 값을 정하려고 한다. 가능한 D의 최댓값을 구해보자.

 입력
 첫째 줄에 N(1 ≤ N ≤ 105)과 S(1 ≤ S ≤ 109)가 주어진다. 둘째 줄에 동생의 위치 Ai(1 ≤ Ai ≤ 109)가 주어진다. 동생의 위치는 모두 다르며, 수빈이의 위치와 같지 않다.

 출력
 가능한 D값의 최댓값을 출력한다.

 */
public class Main {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     int n = scanner.nextInt(); // 동생의 수
     int s = scanner.nextInt(); // 수빈이의 위치
     int[] positions = new int[n];

     for (int i = 0; i < n; i++) {
      positions[i] = scanner.nextInt(); // 동생들의 위치
     }

     /** 가능한 D 값 중 최댓값을 찾기 위해 이분 탐색 사용*/
     long left = 0; // D의 최솟값
     long right = 1000000000; // D의 최댓값
     long result = 0;

     while (left <= right) {
      long mid = (left + right) / 2;
      long time = 0;

      for (int i = 0; i < n; i++) {
       long distance = Math.abs(positions[i] - s); // 수빈이와 동생 사이의 거리
       long moves = distance / mid; // 걷기로 이동해야 하는 횟수

       if (distance % mid != 0) {
        moves++; // 나머지가 남으면 한 번 더 이동
       }

       time += moves; // 해당 동생을 찾는데 걸리는 총 시간 추가
      }

      if (time <= mid) {
       result = mid; // 현재 D값으로 모든 동생을 찾을 수 있음
       right = mid - 1; // 더 큰 D값을 찾기 위해 범위를 왼쪽으로 이동
      } else {
       left = mid + 1; // 현재 D값으로는 모든 동생을 찾을 수 없음
      }
     }

     System.out.println(result);
    }
}
