package lecture;

import java.io.*;
import java.util.Stack;

public class BOJ17413 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean tag = false;
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();

        // < 와 > 사이에 있는 것은 그대로 출력.
        for (char c : s.toCharArray()) {

            if (c == '<') {
                print(stack);
                tag = true;
                System.out.print(c);
            } else if (c == '>') {
                tag = false;
                System.out.print(c);
            } else if (tag) {
                System.out.print(c);
            } else {
                if (c == ' ') {
                    print(stack);
                    System.out.print(c);
                } else {
                    stack.push(c);
                }
            }

        }
        print(stack);
    }

    static void print(Stack<Character> s) {
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }


}
