package src.main.java.dilmah0203;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    /**
     * 알파벳 순서는(피연산자) 그대로 순서를 유지하되, 연산자는 스택에 넣는다.
     * 단, 연산자 스택이 비지 않았다면 우선순위를 따져
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<Character> operand = new Stack<>(); //연산자

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '-':
                case '+':
                case '*':
                case '/':
                    while (!operand.isEmpty() && getPriority(c) <= getPriority(operand.peek())) {
                        sb.append(operand.pop());
                    }
                    operand.push(c);
                    break;
                case '(':
                    operand.add(c);
                    break;
                case ')':
                    while (operand.peek() != '(') {
                        sb.append(operand.pop()); //열린 괄호가 나올 때까지 연산자를 저장
                    }
                    operand.pop();
                    break;
                default: //case 이외의 경우(여기서는 알파벳일 때)
                    sb.append(c);
                    break;
            }
        }

        while (!operand.isEmpty()) {
            sb.append(operand.pop());
        }
        System.out.println(sb.toString());
    }

    public static int getPriority(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else if (operator == '(' || operator == ')') {
            return 0;
        }
        return -1;
    }
}
