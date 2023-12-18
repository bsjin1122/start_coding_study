package siglee.BOJ.week01_2;

import java.util.*;
import java.io.*;

public class Boj1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Double> stack = new Stack<>();

        //char를 index로 사용하기 위해 구현함
        double[] arr = new double[100];

        //문제 값
        char[] charArray = br.readLine().toCharArray();

        //초기화
        for (int i = 0; i < n; i++) {
            arr['A'+i] = Integer.parseInt(br.readLine());
        }

        //연산 수행
        //A보다 크고 Z보다 작거나 같은 값이 나오면 값을 스택에 넣는다. 연산자를 통해 더하기 뺴기 곱하기 나누기를 수행한다.

        for (char c : charArray) {
            if (c >= 'A' && c <= 'Z') {
                stack.push(arr[c]);
            } else {
                double right = stack.pop();
                double left = stack.pop();
                switch (c) {
                    case '*': stack.push(left * right); break;
                    case '+': stack.push(left + right); break;
                    case '-': stack.push(left - right); break;
                    case '/': stack.push(left / right); break;
                }
            }
        }
        System.out.printf("%.2f",stack.pop());
    }
}


/*
* 메모리 제한이 128MB -> 입력을 받을 때 char를 index로 하는 값을 넣어준다.
* stack를 활용해서 구현
* */