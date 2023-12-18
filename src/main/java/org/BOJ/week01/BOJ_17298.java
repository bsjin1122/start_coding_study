package org.BOJ.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BOJ_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = br.read();
        String str = br.readLine(); // 수열 입력
        StringBuilder sb = new StringBuilder(); // 결과 값을 출력할 StringBuilder

        try {
            String input = br.readLine();
            // 공백을 기준으로 문자열에서 분할하여 int 배열에 저장
            int[] array = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // ArrayList로 변환
            List<Integer> list = IntStream.of(array)
                                    .boxed() // int를 Integer로 박싱
                                    .collect(Collectors.toList());

            // 3 5 2 7 -> 5 7 7 -1
            for(int i= 1; i< array.length; i++){
                int criteria = array[i-1];
                List<Integer> subList = list.subList(i, list.size());
                // 최댓값 찾기
                int max = Collections.max(subList);

                // 최댓값 제외하기
                List<Integer> tempList = new ArrayList<>(subList);
                tempList.remove(Integer.valueOf(max)); // Integer 객체로 변환하여 제거해야 함

                // 제외된 리스트에서 다음 최댓값 찾기
                int secondMax = Collections.max(tempList);

                // 최댓값의 인덱스 찾기
                int maxIndex = list.indexOf(max);
                // 그 다음 최댓값의 인덱스 찾기
                int secondMaxIndex = list.indexOf(secondMax);

                int resultMax = compareMax(max, secondMax, maxIndex, secondMaxIndex);
                if(criteria < resultMax){
                    sb.append(" " + resultMax);
                }else{
                    sb.append(" " + -1);
                }

                if(i == array.length-1){
                    sb.append(" " + -1);
                }

                System.out.print(sb.toString().trim());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void searchMax(List<Integer> subList) {

    }

    private static int compareMax(int max, int secondMax, int maxIndex, int secondMaxIndex) {
        if(maxIndex < secondMaxIndex){
            return max;
        }else{
            return secondMax;
        }
    }

}
