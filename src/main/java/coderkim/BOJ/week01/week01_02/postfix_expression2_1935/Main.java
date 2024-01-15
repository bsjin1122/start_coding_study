package main.java.coderkim.BOJ.week01.week01_02.postfix_expression2_1935;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Since 2023.12.17 일
 * @Title 후위 표기식2(1935)
 * @Contents 문제
 * 후위 표기식과 각 피연산자에 대응하는 값들이 주어져 있을 때, 그 식을 계산하는 프로그램을 작성하시오.
 * <p>
 * 입력
 * 첫째 줄에 피연산자의 개수(1 ≤ N ≤ 26) 가 주어진다.
 * <p>
 * 그리고 둘째 줄에는 후위 표기식이 주어진다.
 * <p>
 * (여기서 피연산자는 A~Z의 영대문자이며, A부터 순서대로 N개의 영대문자만이 사용되며, 길이는 100을 넘지 않는다)
 * <p>
 * 그리고 셋째 줄부터 N+2번째 줄까지는 각 피연산자에 대응하는 값이 주어진다.
 * 3번째 줄에는 A에 해당하는 값, 4번째 줄에는 B에 해당하는값 , 5번째 줄에는 C ...이 주어진다.
 * 그리고 피연산자에 대응 하는 값은 100보다 작거나 같은 자연수이다.
 * <p>
 * 후위 표기식을 앞에서부터 계산했을 때, 식의 결과와 중간 결과가 -20억보다 크거나 같고, 20억보다 작거나 같은 입력만 주어진다.
 * <p>
 * 출력
 * 계산 결과를 소숫점 둘째 자리까지 출력한다.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("피연산자의 개수를 입력하시오.");
        int operandCount = sc.nextInt(); // 첫 번째 줄 입력
        sc.nextLine(); // 개행 문자 처리

        System.out.println("후위 표기식을 입력하시오." +
                "\n(여기서 피연산자는 A~Z의 영대문자이며, A부터 순서대로 N개의 영대문자만이 사용되며, 길이는 100을 넘지 않는다.)");

        String pfxExpression = sc.nextLine();

        String operands = Stream.of(
                        pfxExpression.split("")) // 문자열 pfExpression을 ""으로 구분하여 나누고
                .filter(i -> Character.isLetter(i.charAt(0))) // 알파벳인 경우만 골라서 필터링
                .distinct() // 중복 제거
                .collect(Collectors.joining());

        String[] pfxArr = pfxExpression.split("");
        String[] operandsArr = operands.split("");
        Map<String, Integer> map = new HashMap<>(); // Map(피연산자 알파벳, 대응하는 값)

        System.out.println("피연산자에 대응하는 값을 입력하시오.");

        for (int i = 0; i < operandCount; i++) {
            int operandNum = sc.nextInt();
            map.put(operandsArr[i], operandNum);
        }

        Stack<Double> stack = new Stack<>();


        for (String s : pfxArr) {
            if ("+-*/".contains(s)) { // 연산자인 경우에만 stack에서 pop 한다
                double operand2 = stack.pop(); // 후입선출이라 2가 먼저 pop한다
                double operand1 = stack.pop(); // 후입선출이라 1이 그다음에 pop한다
                double result = computedValue(operand1,operand2,s);
                stack.push(result); // computedValue 메소드로 연산한 값을 stack에 push
            }else{
                stack.push(Double.valueOf(map.get(s)));
            }
        }
        // 마지막에 남은 stack 값이 피연산자 후위표기식 연산 결과값
        System.out.printf("%.2f",stack.pop()); // 소수 둘째 자리까지 출력
    }

    // 피연산자를 후위 표기식 연산을 하는 메소드
    private static double computedValue(double operand1, double operand2, String operator) {

        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                // 피연산자에 대응 하는 값은 100보다 작거나 같은 자연수이다. 이기 때문에
                // 피연산자에 대응 하는 값은 0이 올 수 없다.
                return operand1 / operand2;
            default:
                return 0.0;
        }
    }
}
