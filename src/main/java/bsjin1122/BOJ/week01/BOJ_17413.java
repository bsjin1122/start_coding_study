package bsjin1122.BOJ.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 단어뒤집기2
public class BOJ_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String str = br.readLine(); // 문자열 S입력
        StringBuilder sb = new StringBuilder(); // 결과 값을 출력할 StringBuilder
        Stack<Character> stack = new Stack <> (); // 후입선출 기능을 이용하기 위한 자료구조 Stack
        boolean flag = false;

        for(int i =0; i < str.length(); i++){
            if(str.charAt(i) == '<'){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                flag = true;
            }
            else if(str.charAt(i) == '>'){
                flag = false;
                sb.append(str.charAt(i));
                continue;
            }

            if(flag == true){
                sb.append(str.charAt(i));
            }else if(flag == false) {
                if (str.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                } else {
                    stack.push(str.charAt(i));
                }
            }

            if(i == str.length() - 1){
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }
        // 결과문 출력
        System.out.println(sb);


    }
}
