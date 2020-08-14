package lecture.dataStructure;

import java.io.*;
import java.util.Stack;

/**
 * acmicpc.net/problem/17413 단어 뒤집기2
 * 단어 뒤집기 -> 뒤집다 (넣은 순서의 반대로 나오는 Stack의 성질을 이용해서 풀 수 있는 문제)
 */
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
