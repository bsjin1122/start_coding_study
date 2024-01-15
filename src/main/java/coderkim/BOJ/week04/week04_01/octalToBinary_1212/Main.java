package main.java.coderkim.BOJ.week04.week04_01.octalToBinary_1212;

import java.util.Scanner;


/**
 @Title 8진수 2진수(1212)
 @Since 2024.01.12
 @Content

 문제
 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.

 입력
 첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.

 출력
 첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        StringBuilder sb = new StringBuilder();
        String[] inputs = input.split("");
            // 8진수를 2진수로 바꿔준다
        for (int i = 0; i < length; i++) {
            int octalValue = Integer.parseInt(inputs[i]);
            String binaryValue = Integer.toBinaryString(octalValue);

            // 2진수 자리 3자리로 맞춰준다
            if(binaryValue.length() == 2 && i != 0)
                binaryValue = "0" + binaryValue;
            else if(binaryValue.length() == 1 && i !=0)
                binaryValue = "00" + binaryValue;

            // 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다
            // 첫 번째 자리수가 0이면 뺴준다
            if(!binaryValue.equals("0")){
                if( i == 0 && binaryValue.startsWith("0") && binaryValue.startsWith("00")){
                    binaryValue = binaryValue.substring(1,binaryValue.length());
                }

            }
            sb.append(binaryValue);
        }
        String result = sb.toString();
        System.out.println(result);
        sc.close();
    }
}
