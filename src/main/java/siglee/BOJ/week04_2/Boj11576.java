package siglee.BOJ.week04_2;

import java.io.*;
import java.util.*;

public class Boj11576 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int tmp = 0;

        int index = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        //여기서 10진수로 변경하는 과정
        for (int i = index - 1; i >= 0; i--) {
            tmp += (Integer.parseInt(st.nextToken())*Math.pow(A,i));
        }
        StringBuilder sb = new StringBuilder();
        //여기서 B진수로 변경
        while (tmp > 0) {
            stack.push(tmp % B);
            tmp /= B;
        }
        while (!stack.isEmpty()) {
            if (stack.size() == 1) {
                System.out.println(stack.pop());
            } else {
                System.out.print(stack.pop() + " ");
            }
        }
    }
}
/*
수도코드
BufferedReader() 입력 받는다.
int A = Integer.parseInt(br.readLine()); A진수
int B = Integer.parseInt(br.readLine()); B진수
tmp = 10진수로 변경된 값을 저장

index = 총 자릿 수를 의미

10진수 변환
for (int i = index - 1; i >= 0; i--) {
    tmp += (Integer.parseInt(st.nextToken())*Math.pow(A,i));
}
B진수 변환
변환 뒤의 값 stack 저장 (거꾸로 꺼내기 때문에 stack 사용)

stack에서 값 꺼내옴

* */