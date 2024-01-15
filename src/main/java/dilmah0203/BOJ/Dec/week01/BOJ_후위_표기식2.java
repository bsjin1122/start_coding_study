package src.main.java.dilmah0203.BOJ.Dec.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_후위_표기식2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            array[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>(); //피연산자 저장
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') { //영대문자라면
                stack.push(array[c - 'A']);
            } else { //연산자라면
                if (!stack.isEmpty()) {
                    double a = stack.pop();
                    double b = stack.pop();

                    switch (c) {
                        case '+':
                            stack.push(b + a);
                            break;
                        case '-':
                            stack.push(b - a);
                            break;
                        case '/':
                            stack.push(b / a);
                            break;
                        case '*':
                            stack.push(b * a);
                            break;
                    }
                }
            }
        }

        System.out.printf("%.2f", stack.pop());

    }
}
