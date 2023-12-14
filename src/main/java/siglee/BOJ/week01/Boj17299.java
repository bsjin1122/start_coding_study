package siglee.BOJ.week01;

import java.util.*;
import java.io.*;

public class Boj17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] result = new int[n];
        //등장 횟수
        int[] freq = new int[1000001];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //초기화
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            freq[a[i]] ++;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i=1; i<n; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            }
            while (!stack.isEmpty() && freq[a[stack.peek()]] < freq[a[i]]) {
                result[stack.pop()] = a[i];
            }
            stack.push(i);
        }

        while (!stack.empty()) {
            result[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
    }

}
