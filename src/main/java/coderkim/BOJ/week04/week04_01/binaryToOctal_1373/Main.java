package main.java.coderkim.BOJ.week04.week04_01.binaryToOctal_1373;
import java.util.Scanner;

/**
 @Title 2진수 8진수(1373)
 @Since 2024.01.07
 @Content 문제
 2진수가 주어졌을 때, 8진수로 변환하는 프로그램을 작성하시오.

 입력
 첫째 줄에 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다.

 출력
 첫째 줄에 주어진 수를 8진수로 변환하여 출력한다.

 참고 <a href="https://m.blog.naver.com/javrin4/220956809081">...</a>

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        // 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다
        String input = sc.nextLine();
        int length = input.length();
        // 8진수를 담기 위한 객체
        StringBuilder octalStringBuilder = new StringBuilder();
        // 8진수는 2의 3제곱. 뒤에서부터 숫자를 3자리씩 묶어준 그룹을 2진수 8진수 로 변환.
        // 모자른 자리는 0을 플러스 해준다
        for (int i = length; i > 0; i -= 3) {
            String group = input.substring(Math.max(i - 3, 0),i);
            if(group.length() < 3){
                group = "0" + group;
            }
            int decimal = Integer.parseInt(group, 2);
            octalStringBuilder.append(decimal);
        }

        // 저장된 순서가 거꾸로이기 때문에 뒤집어준다.
        String octal = octalStringBuilder.reverse().toString();

        System.out.println(octal);

        sc.close();


    }
}
