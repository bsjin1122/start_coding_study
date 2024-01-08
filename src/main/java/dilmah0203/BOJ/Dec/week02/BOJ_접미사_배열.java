package src.main.java.dilmah0203.BOJ.Dec.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_접미사_배열 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, s.length());
            list.add(str);
        }

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
