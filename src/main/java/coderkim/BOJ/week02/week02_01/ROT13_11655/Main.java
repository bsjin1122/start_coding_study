package main.java.coderkim.BOJ.week02.week02_01.ROT13_11655;

import java.util.Scanner;

/**
 @Title ROT13(11655)
 @Since 2023.12.20
 @Content 문제
 ROT13은 카이사르 암호의 일종으로 영어 알파벳을 13글자씩 밀어서 만든다.
 예를 들어, "Baekjoon Online Judge"를 ROT13으로 암호화하면 "Onrxwbba Bayvar Whqtr"가 된다.
 ROT13으로 암호화한 내용을 원래 내용으로 바꾸려면 암호화한 문자열을 다시 ROT13하면 된다.
 앞에서 암호화한 문자열 "Onrxwbba Bayvar Whqtr"에 다시 ROT13을 적용하면 "Baekjoon Online Judge"가 된다.
 ROT13은 알파벳 대문자와 소문자에만 적용할 수 있다. 알파벳이 아닌 글자는 원래 글자 그대로 남아 있어야 한다.
 예를 들어, "One is 1"을 ROT13으로 암호화하면 "Bar vf 1"이 된다.
 문자열이 주어졌을 때, "ROT13"으로 암호화한 다음 출력하는 프로그램을 작성하시오.
 입력
 첫째 줄에 알파벳 대문자, 소문자, 공백, 숫자로만 이루어진 문자열 S가 주어진다. S의 길이는 100을 넘지 않는다.
 출력
 첫째 줄에 S를 ROT13으로 암호화한 내용을 출력한다
 */
public class Main {
    public static void main(String[] args) {
        /**
         모든 알파벳은 ASCII 코드 값을 갖고 있으므로 더하거나 빼는 방식으로 n만큼 이동한 문자를 찾을 수 있다
         각각의 문자에 고유한 ASCII 코드값을 갖고 있다
         */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        int shift = 13;
        int size = 26; // 알파벳 문자 범위 크기
        String rot13;

        // 문자열 순회
        for (char c : input.toCharArray()) {

            // 문자일 경우만 변형
            if (Character.isLetter(c)) {
                // 문자 범위 a ~ z 또는 A ~ z
                // c가 대문자일 경우 시작 문자는 'A로 설정,  소문자일 경우 시작문자를 'a'로 설정
                char startPoint = Character.isUpperCase(c) ? 'A' : 'a';

                //  문자 - 시작 문자 == 거리
                //  암호화된 문자 = (문자 - 시작 문자 + 이동할 거리) % 범위 크기 + 시작문자;
                c = (char) ((c - startPoint + shift ) % size + startPoint);
            }

            // 문자가 아닐 때는 원형 그대로
            stringBuilder.append(c);
        }
        rot13 = stringBuilder.toString();
        System.out.println(rot13);
        sc.close();
    }

}

