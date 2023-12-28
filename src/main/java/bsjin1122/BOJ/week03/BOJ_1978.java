package bsjin1122.BOJ.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1978 {
    /**
     * @author bsjin
     * @date 2023/12/29
     * @title 소수 찾기
     *
     * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
     * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받은 문자열을 Intger 데이터타입으로 변환한다.(기본형 String)
        int n = Integer.parseInt(br.readLine());

        String str = br.readLine(); // 문자열 입력

        // 공백을 기준으로 문자열을 분리하여 문자열 배열로 만듭니다.
        String[] strArray = str.split(" ");
        int[] intArray = new int[strArray.length];

        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        int num = 0;
        int count = 0;

        //값 하나씩 소수 검증 (i = 배열에 저장된 입력값 인덱스)
        for(int i=0;i<intArray.length;i++) {

            //소수구하기
            //값을 2~(n-1)번째 값으로 계속 나눈다.
            for(int j=2; j <= intArray[i]-1; j++) {
                if(intArray[i] % j ==0) { //만약 나눈 나머지가 0이면 j는 arr[i]의 약수
                    count++;
                    break; //소수가 아닌 것이 확정되면 for문을 빠져나와서 그 다음 입력값으로 넘어감
                }
            }

            if(intArray[i]!=1 && count==0) {
                num++;
            }
        }

        //정답 출력
        System.out.println(num);

    }
}
