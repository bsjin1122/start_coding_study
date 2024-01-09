package siglee.BOJ.week03_2;

import java.io.*;
import java.util.*;

public class Boj2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());

        long tow = 0;
        long five = 0;

        for(long i = 5; i <= n ; i *=5){
            five += (n / i);
        }
        for(long i = 2; i <= n ; i *=2){
            tow += (n / i);
        }

        for(long i = 5; i <= (n-m) ; i *=5){
            five -= (n-m) / i;
        }
        for(long i = 2; i <= (n-m) ; i *=2){
            tow -= (n-m) / i;
        }
        for(long i = 5; i <= m ; i *=5){
            five -= (m / i);
        }
        for(long i = 2; i <= m ; i *=2){
            tow -= (m / i);
        }

        System.out.println(Math.min(tow,five));
    }
}
