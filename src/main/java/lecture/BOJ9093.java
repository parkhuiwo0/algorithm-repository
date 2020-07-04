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

            for (char ch : str.toCharArray()) { // 문자열을 캐릭터형 배열로 바꿔서 하나씩 접근
                if (ch == '\n' || ch == ' ') { // 한 문자가 줄바꿈 혹은 공백이라면
                    while (!stack.isEmpty()) { // 스택이 비워지지 않을 때 까지 반복
                        bw.write(stack.pop()); // 하나씩 꺼내기
                    }
                    bw.write(ch); // 공백 혹은 띄어쓰기 작성
                } else {
                    stack.push(ch); // 그게 아니라면 넣기
                }

            }
            bw.flush();

        }


    }
}
