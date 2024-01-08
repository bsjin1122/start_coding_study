package siglee.BOJ.week04;

import java.io.*;
import java.math.*;
import java.util.*;

public class Boj1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger num = new BigInteger(br.readLine(), 2);
        System.out.println(num.toString(8));
    }
}