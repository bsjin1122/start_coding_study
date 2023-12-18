package boj_week1_01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 문제
 * 문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.
 * <p>
 * 먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.
 * <p>
 * 알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
 * 문자열의 시작과 끝은 공백이 아니다.
 * <p>
 * '<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다.
 * 또, 두 문자의 개수는 같다.
 * <p>
 * 태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고,
 * '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다.
 * <p>
 * 단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고,
 * <p>
 * 연속하는 두 단어는 공백 하나로 구분한다.
 * <p>
 * 태그는 단어가 아니며,
 * <p>
 * 태그와 단어 사이에는 공백이 없다.
 * <p>
 * 입력
 * 첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.
 * <p>
 * 출력
 * 첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.
 */
public class Solution {
    /**
     * 문제 단어 뒤집기 2 (<a href="https://www.acmicpc.net/problem/17413">...</a>)
     * 문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.
     * 먼저, 문자열 S는 아래와과 같은 규칙을 지킨다.
     * 알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
     * 문자열의 시작과 끝은 공백이 아니다.
     * '<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다.
     * 또, 두 문자의 개수는 같다.
     * 태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고,
     * '<'와 '>' 사이에는 알파벳 소문자와 공백만 있다.
     * 단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고,
     * 연속하는 두 단어는 공백 하나로 구분한다.
     * 태그는 단어가 아니며,
     * 태그와 단어 사이에는 공백이 없다.
     * 입력
     * 첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.
     * 출력
     * 첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.
     */
    public String reverseWords(String S) {
        StringBuilder result = new StringBuilder();

        // 문자열에서 '<'와 '>'를 ','로 대체하여 태그를 구분하기 쉽게 함
        String s = S.replace(">", ">,");
        s = s.replace("<", ",<");

        // 문자열을 ','를 기준으로 분할하여 배열로 저장
        String[] arr = s.split(",");

        for (int i = 0; i < arr.length; i++) {

            // 원소가 ""일 경우에는 공백 문자열이므로 무시
            if (!arr[i].equals("")) {

                // "<"로 시작하는 문자열(태그)일 경우 그대로 넣는다.
                // 아닐 경우 각 단어를 뒤집어서 공백으로 구분하여 넣는다.
                if (arr[i].charAt(0) != '<') {
                    String[] words = arr[i].split(" ");
                    StringBuilder reversedWords = new StringBuilder();

                    for (int j = 0; j < words.length; j++) {
                        reversedWords.append(new StringBuilder(words[j]).reverse());
                        if (j < words.length - 1) {
                            reversedWords.append(" ");
                        }
                    }

                    arr[i] = reversedWords.toString();
                }

                // 결과에 현재 원소(태그 또는 뒤집힌 단어)를 추가
                result.append(arr[i]);
            }
        }

        // 최종 결과 문자열을 반환
        return result.toString();
    }


    /**
     문제 쇠막대기 <a href="https://www.acmicpc.net/problem/10799">...</a>
     (( 는 막대기
     () 는 레이저
     )) 는 막대기의 끝

     '(('인지 아닌지 구분
     */
    public int cuttingsSticks(String S){
        Stack<Character> stack = new Stack<>();
        int totalPieces = 0; // 총 쇠막대기 조각 개수
        int openCount = 0;  // 현재까지 스택에 쌓인 '(' 개수

        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(c); // '('가 나타나면 쇠막대기의 시작을 나타내므로, 스택에 '('을 push
                openCount++;
            } else if (c == ')') { // ')'는 레이저 또는 쇠막대기의 끝을 나타낸다.
                if (!stack.isEmpty()) {
                    stack.pop(); // '('를 팝하여 stack에서 뺀다
                    openCount--; // 여는 괄호 '('의 개수를 감소시킴
                    totalPieces += openCount; // 쇠막대기의 조각 개수 추가
                }
            }
        }

        return totalPieces;// 총 막대기 개수
    }


    /**
     문제 오큰수
     크기가 N인 수열 A = A1, A2, ..., AN이 있다.
     수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다.
     Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. // Ai보다 큰 가장 가까운 수
     그러한 수가 없는 경우에 오큰수는 -1이다.

     예를 들어, A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다.
     A = [9, 5, 4, 8]인 경우에는 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.

     입력
     첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다.
     둘째 줄에 수열 A의 원소 A1, A2, ..., AN (1 ≤ Ai ≤ 1,000,000)이 주어진다.

     출력
     총 N개의 수 NGE(1), NGE(2), ..., NGE(N)을 공백으로 구분해 출력한다.
     */
    public void findNGE(int[] A){
        int n = A.length;
        int[] result = new int[n]; // 결과 배열

        Stack<Integer> stack = new Stack<>();
        Arrays.fill(result, -1); // 초기값을 -1로 설정

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && A[i] > A[stack.peek()]) {
                result[stack.pop()] = A[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            A[stack.pop()] = -1;
        }


        for(int num : result){
            System.out.print(num+" ");
        }
    }

// 백준에선 시간 초과로 아래 코드로 제출함
//    public class Main {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            Solution solution = new Solution();
//            // 오큰수
//            int length = sc.nextInt();
//
//            int[] A = new int[length];
//
//            for(int i = 0; i < length; i++){
//                A[i] = sc.nextInt();
//            }
//
//            int[] nums = solution.findNGE(A);
//            StringBuilder sb = new StringBuilder();
//            for (int n : nums) {
//                sb.append(n).append(' ');
//            }
//
//            System.out.println(sb);
//        }
//    }
//
//    class Solution{
//        public int[] findNGE(int[] A){
//            int n = A.length;
//            int[] result = new int[n]; // 결과 배열
//
//            Stack<Integer> stack = new Stack<>();
//            Arrays.fill(result, -1); // 초기값을 -1로 설정
//
//            for (int i = 0; i < n; i++) {
//                while (!stack.isEmpty() && A[i] > A[stack.peek()]) {
//                    result[stack.pop()] = A[i];
//                }
//                stack.push(i);
//            }
//            while(!stack.isEmpty()){
//                A[stack.pop()] = -1;
//            }
//            return result;
//        }
//
//    }

    /**
     오등큰수
     */

    public void findNGF(int[] nums){
        int n = nums.length;
        int[] result = new int[n]; // 결과 배열
        Map<Integer, Integer> frequencyMap = new HashMap<>(); // 원소의 등장 횟수를 저장하는 맵
        Stack<Integer> stack = new Stack<>(); // 인덱스를 저장하는 스택

        // 원소의 등장 횟수 계산
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        Arrays.fill(result, -1); // 초기값을 -1로 설정

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && frequencyMap.get(nums[i]) > frequencyMap.get(nums[stack.peek()])) {
                int idx = stack.pop();
                result[idx] = nums[i];
            }
            stack.push(i);
        }

        for(int i : result){
            System.out.print(i + " ");
        }
    }



}
