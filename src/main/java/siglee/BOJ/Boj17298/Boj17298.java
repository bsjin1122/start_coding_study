package siglee.BOJ.Boj17298;

import java.util.*;
import java.io.*;

public class Boj17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] result = new int[n];
        int[] tmp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //초기화
        for (int i = 0; i < n; i++) {
            tmp[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < n; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            }
            while (stack.isEmpty() == false && tmp[stack.peek()] < tmp[i]) {
                result[stack.pop()] = tmp[i];
            }
            stack.push(i);
        }
        while (stack.isEmpty() == false) {
            result[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();

        for (int i : result) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);
    }
}
