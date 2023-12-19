package bsjin1122.BOJ.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 오큰수
// data[] 에 값을 넣고 해당 인덱스의 값과 그 다음 data[i]번째 값보다 작으면(stack이 비어있지 않은 상태에서)
// stack을 pop 한 인덱스의 값이 = data[i]가 된다.
// false인 경우엔 stack에 i값 넣기
public class BOJ_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine()); // 입력할 숫자의 수
        int[] data = new int[N]; // 숫자 수만큼 배열 생성

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i =0; i<N; i++){
            data[i] = Integer.parseInt(st.nextToken()); // 쪼개진 숫자만큼 배열에 넣기
        }

        Stack<Integer> stack = new Stack<>(); // 스택 할당

        for(int i =0; i<N; i++){
            while(!stack.isEmpty() && data[stack.peek()] < data[i]){
                data[stack.pop()] = data[i];
            }
            stack.add(i);
        }
        while(!stack.isEmpty()) {
            data[stack.pop()] = -1;
        }
        for(int i = 0; i < N; i++){
            sb.append(data[i]).append(" ");
        }

        System.out.println(sb);

    }

}
