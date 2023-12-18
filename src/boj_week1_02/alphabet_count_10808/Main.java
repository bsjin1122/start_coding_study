package boj_week1_02.alphabet_count_10808;


import java.util.Scanner;

/**
 @Title 알파벳 개수(10808)
 @Since 2023.12.18 월
 @Contents
 문제
 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.

 입력
 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

 출력
 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int[] alphabetCount = new int[26]; // 알파벳 개수를 저장할 배열

        // 단어를 순회하면서 각 알파벳의 개수를 카운트
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if ('a' <= c && c <= 'z') { // 알파벳 소문자인 경우만 처리
                alphabetCount[c - 'a']++; // 알파벳 'a'부터의 상대적 위치를 인덱스로 사용하여 개수를 증가
            }
        }

        // 결과를 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(alphabetCount[i]);
            if (i < 25) {
                System.out.print(" ");
            }
        }
    }
}
