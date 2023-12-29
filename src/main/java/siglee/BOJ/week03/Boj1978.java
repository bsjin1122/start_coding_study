package siglee.BOJ.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1978 {
    static boolean[] prime = new boolean[1001];

    public static void main(String[] args) throws IOException {
        findPrime();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        for (int i = 0; i < index; i++) {
            if(!prime[Integer.parseInt(st.nextToken())]){
                count++;
            }
        }
        System.out.println(count);
    }

    //일단 변수를 초기화 해줘야한다. -> 이를 에러스토네체로 구현해보자
    public static void findPrime() {
        prime[1] = true;
        for(int i = 2 ; i <= 1000 ; i++){
            if(prime[i] == false){
                for(int j = i+i ; j <= 1000 ; j+=i){
                    prime[j] = true;
                }
            }
        }
    }
}