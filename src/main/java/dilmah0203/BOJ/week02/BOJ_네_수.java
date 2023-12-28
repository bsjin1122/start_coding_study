package src.main.java.dilmah0203.BOJ.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_네_수 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String array[] = new String[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = st.nextToken();
        }

        String a = array[0] + array[1];
        String b = array[2] + array[3];

        Long sum = Long.parseLong(a) + Long.parseLong(b);

        System.out.println(sum);
    }
}
