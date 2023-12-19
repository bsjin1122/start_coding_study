package main.java.coderkim.BOJ.week02.week02_02.input_str_analysis_10820;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 @Title 문자열 분석(10820)
 @Since 2023.12.19
 @Content

 문제
 문자열 N개가 주어진다. 이때, 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오.

 각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.

 입력
 첫째 줄부터 N번째 줄까지 문자열이 주어진다. (1 ≤ N ≤ 100) 문자열의 길이는 100을 넘지 않는다.

 출력
 첫째 줄부터 N번째 줄까지 각각의 문자열에 대해서 소문자, 대문자, 숫자, 공백의 개수를 공백으로 구분해 출력한다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        List<String> result = new ArrayList<>();

        // 입력 스트림에서 다음 라인(문자열)이 있는지 확인
        // 입력이 더 이상 없을 때까지 반복
        while (sc.hasNextLine()) {
            int lowercaseCount = 0; // 소문자 개수
            int uppercaseCount = 0; // 대문자 개수
            int numberCount = 0; // 숫자 개수
            int blankCount = 0; // 공백 개수

            input = sc.nextLine();

            if (input.isEmpty()) {
                break; // 빈 문자열 입력 시 반복문 종료
            }

            // 문자열의 소문자 대문자 숫자 공백 갯수를 세서 담아야 함
            for (char c : input.toCharArray()) {

                if (Character.isDigit(c)) { // c가 숫자일 때
                    numberCount++;
                } else if (Character.isWhitespace(c)) { // c가 공백일 때
                    blankCount++;
                } else if (Character.isUpperCase(c)) { // c가 대문자일 때
                    uppercaseCount++;
                } else if (Character.isLowerCase(c)) { // c가 소문자일 때
                    lowercaseCount++;
                }
            }

            result.add(lowercaseCount + " " + uppercaseCount + " " + numberCount + " " + blankCount);
        }

        result.forEach(System.out::println);

        sc.close(); // 입력 종료
    }
}