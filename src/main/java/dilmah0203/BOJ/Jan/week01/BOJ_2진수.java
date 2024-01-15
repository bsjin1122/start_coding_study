package src.main.java.dilmah0203.BOJ.Jan.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2진수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        if (num == 0) {
            System.out.println(0);
        } else {
            while (num != 1) {
                //나머지가 0보다 작을 수 있으므로 절대값 처리
                sb.append(Math.abs(num % -2));
                //나눴을 때 몫이 정수로 떨어지지 않는다면
                num = (int) Math.ceil((double) num / -2);
            }
            sb.append(num);
        }
        System.out.println(sb.reverse());
    }
}