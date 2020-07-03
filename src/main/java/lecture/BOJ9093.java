package lecture;

import java.io.*;
import java.util.Stack;

/**
 * 단어 뒤집기
 * url : https://www.acmicpc.net/problem/9093
 */
public class BOJ9093 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (t-- > 0) {
            String str = br.readLine() + "\n";
            Stack<Character> stack = new Stack<>();

            for (char ch : str.toCharArray()) {
                if (ch == '\n' || ch == ' ') {
                    while (!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(ch);
                } else {
                    stack.push(ch);
                }

            }
            bw.flush();

        }


    }
}
