package siglee.BOJ.week04;

import java.io.*;
import java.math.*;
import java.util.*;

public class Boj1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(br.readLine(), 8);
        System.out.println(n.toString(2));
    }
}
