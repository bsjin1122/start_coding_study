package boj_week1_02.find_alphabet_10809;

import java.util.Scanner;

/**
  @Title 알파벳 찾기(10809)
  @Since 2023.12.18 월
  @Contents
  문제
  알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

  입력
  첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

  출력
  각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.

  만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.

 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int[] alphabetPositions = new int[26]; // 알파벳 위치를 저장할 배열, 초기값은 -1로 설정

        // 배열 초기화: 모든 알파벳의 위치를 -1로 초기화
        for (int i = 0; i < 26; i++) {
            alphabetPositions[i] = -1;
        }

        // 단어를 순회하면서 각 알파벳의 위치를 찾습니다.
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a'; // 알파벳 'a'부터의 상대적 위치를 인덱스로 사용

            // 해당 알파벳의 위치가 아직 기록되지 않았다면, 현재 위치를 저장
            if (alphabetPositions[index] == -1) {
                alphabetPositions[index] = i;
            }
        }

        // 결과를 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(alphabetPositions[i]);
            if (i < 25) {
                System.out.print(" ");
            }
        }
    }
}
