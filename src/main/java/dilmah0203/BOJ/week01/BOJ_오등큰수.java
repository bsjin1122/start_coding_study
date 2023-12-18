package dilmah0203.BOJ.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_오등큰수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        int[] count = new int[1000000 + 1]; //수열 등장 횟수를 저장하는 배열, 주어진 수가 count 배열의 크기보다 클 수 있으므로

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            count[array[i]]++;
        }

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];
        Arrays.fill(result, -1);
        //count : [0,3,2,1,1,0,0]
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && count[array[stack.peek()]] < count[array[i]]) {
                result[stack.pop()] = array[i];
            }

            stack.push(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(result[i]).append(' ');
        }
        System.out.println(sb);
    }
}
