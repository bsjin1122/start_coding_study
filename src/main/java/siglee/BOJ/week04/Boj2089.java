package siglee.BOJ.week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        aux(Integer.parseInt(br.readLine()));
    }
    public static void aux(int num) {
        StringBuilder sb = new StringBuilder();
        if (num == 0) {
            System.out.println(0);
            return;
        }

        while (num != 1) {
            sb.append(Math.abs(num % -2));
            num = (int) Math.ceil((double) num/(-2));
        }

        //마지막 데이터 추가 1일때 탈출하게 되는데 이 때 문제가 1일 때 반복문을 탈출하게 되는데 이때 1이 들어가지 않게 되는 문제가 발생
        sb.append(num);
        System.out.println(sb.reverse());
    }
}
