package siglee.BOJ.week01;

import java.util.*;
import java.io.*;

public class Boj17413 {
    public static void main(String[] args) throws Exception {
        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean tag = false;
        String str = br.readLine();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '<') {
                tag = true;
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(str.charAt(i));
            } else if (str.charAt(i) == '>') {
                tag = false;
                sb.append(str.charAt(i));
            } else if (tag) {
                sb.append(str.charAt(i));
            } else if (tag == false) {
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(str.charAt(i));
                } else {
                    stack.push(str.charAt(i));
                }
            }
        }
        while (stack.isEmpty() == false) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}