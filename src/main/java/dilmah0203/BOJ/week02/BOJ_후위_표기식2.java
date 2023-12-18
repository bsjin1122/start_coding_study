import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BOJ_후의_표기식2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //피연산자 개수
        String s = br.readLine();

        //후위표기식 -> 연산자가 나중에 나온다.
        //A + (B * C) - (D / E)
        Map<Character, Double> map = new HashMap<>();
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < n; i++) { //피연산자의 개수만큼 값을 할당
            double value = Double.parseDouble(br.readLine());
            map.put((char) ((char) 'A' + i), value);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                stack.push(map.get(c));
            } else {
                if (!stack.isEmpty()) {
                    double a = stack.pop();
                    double b = stack.pop();
                    switch (c) {
                        case '-':
                            stack.push(b - a);
                            break;
                        case '+':
                            stack.push(b + a);
                            break;
                        case '*':
                            stack.push(b * a);
                            break;
                        case '/':
                            stack.push(b / a);
                            break;
                    }
                }
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}
