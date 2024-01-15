package src.main.java.dilmah0203.BOJ.Jan.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_Base_Conversion {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        int decimal = 0;
        for (int i = 0; i < m; i++) {
            decimal += Integer.parseInt(st.nextToken()) * Math.pow(A, m - i - 1);
        }

        if (decimal == 0) {
            System.out.println("0");
        }

        String str = "";
        while (decimal > 0) {
            str = Integer.toString(decimal % B) + " " + str;
            decimal /= B;
        }

        System.out.print(str);
    }
}
