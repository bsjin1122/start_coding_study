package bsjin1122.BOJ.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @author bsjin
 * @date 2023/12/25
 * @note 백준 203-자료구조1 접미사 배열(11656)
 */

/**
 * 문제: 접미사 배열은 문자열 S의 모든 접미사를 사전순으로 정렬해 놓은 배열이다.
 baekjoon의 접미사는 baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n 으로 총 8가지가 있고, 이를 사전순으로 정렬하면, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon이 된다.
 문자열 S가 주어졌을 때, 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램을 작성하시오.
 *
 */
public class BOJ_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 문자열 S입력
        List<String> arrList = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){
            arrList.add(str.substring(i)); // 문자열을 잘라서 arrayList에 넣는다.
        }

        Collections.sort(arrList); // 알파벳 순으로 정렬

        for(String string : arrList){ // 출력
            System.out.println(string);
        }
    }
}
