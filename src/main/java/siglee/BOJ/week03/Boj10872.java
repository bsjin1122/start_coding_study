package siglee.BOJ.week03;
import java.io.*;
import java.util.*;

public class Boj10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *=i;
        }
        System.out.println(result);
    }
}
