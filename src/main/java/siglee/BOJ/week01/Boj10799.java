package siglee.BOJ.week01;

import java.io.*;
import java.util.*;

public class Boj10799 {
    public static void main(String[] args) throws IOException {
        aux2();
    }

    //1차 풀이 과정
    private static void aux1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] cArray = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        int result = 0;
        while (cArray.length > i) {
            if (cArray[i] == '(' && cArray[i + 1] == ')') {
                result += stack.size();
                i+=1;
            } else if (cArray[i] == '(')
                stack.push(cArray[i]);
            else if (cArray[i] == ')') {
                stack.pop();
                result += 1;
            }
            i++;
        }

        System.out.println(result);
    }
    //2차 풀이 과정 for문 변경
    private static void aux2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] cArray = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < cArray.length; i++) {
            if (cArray[i] == '(') {
                stack.push(cArray[i]);
                continue;
            }
            if (cArray[i] == ')') {
                stack.pop();
                if (cArray[i - 1] == '(')
                    result += stack.size();
                else
                    result++;
            }
        }
        System.out.println(result);
    }
}
