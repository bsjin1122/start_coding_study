package src.main.java.dilmah0203.BOJ.Dec.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_팩토리얼_0의_개수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //n의 범위가 500까지이므로 long형으로 했을 때 범위 초과
        BigInteger result = new BigInteger("1");
        for(int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        String s = result.toString();
        int zero = 0;

        for(int i = s.length() - 1; i > 1; i--) {
            if(s.charAt(i) - '0' == 0) {
                zero++;
            }
            else break;
        }
        System.out.println(zero);
    }
}

