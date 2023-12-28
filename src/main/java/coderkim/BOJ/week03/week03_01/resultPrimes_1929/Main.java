package main.java.coderkim.BOJ.week03.week03_01.resultPrimes_1929;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 @Title 소수 구하기(1929)
 @Since 2023.12.28
 @Content
 문제
 M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

 입력
 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

 출력
 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(list.size() != 2){
            list.add(sc.nextInt());
        }

        for(int i = list.get(0); i <= list.get(1); i++){

            //i가 소수인지 판별하는 메소드
           if(isPrimes(i)){
               System.out.println(i);
           }
        }

        sc.close();
    }

    // 소수인지 판별하는 메소드
    public static boolean isPrimes(int i){
        if(i <= 1){
            return false;
        }
        for(int p = 2; p * p <= i; p++ ){
            if(i % p == 0){
                return false;
            }
        }
        return true;
    }
}
