package siglee.BOJ.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1929 {
    static int[] prime ;
    static boolean[] check;
    static int pn ;
    static int max;
    static int min;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        min = Integer.parseInt(str[0]);
        max = Integer.parseInt(str[1]);
        pn = 0;
        prime = new int[max];
        check = new boolean[max+2];

        aux(min,max);
        for(int i = 0 ; i <pn ; i++){
            System.out.println(prime[i]);
        }
    }

    static void aux(int min, int max){

        for(int i = 2 ; i <= max ; i++){
            if(!check[i]){
                if(i >= min)
                    prime[pn++] = i;

                for (int j = i + i; j <= max; j += i) {
                    check[j] = true;
                }
            }
        }
    }
}
