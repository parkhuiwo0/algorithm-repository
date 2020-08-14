package lecture.dataStructure;

import java.io.*;
import java.util.Stack;

/**
 * acmicpc.net/problem/10799 (쇠막대기)
 * 쇠 막대기인지 아닌지 알기 위해서 index를 사용.
 * Stack의 성질을 이용해서 풀 수 있는 문제.
 */
public class BOJ10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        String s = br.readLine();
        int index = 0;
        int count = 0;

        for (char c : s.toCharArray()) {
            index++;
            if (c == ')') {
                if (stack.pop()+1 == index) {
                    count+=stack.size();
                }
                else {
                    count++;
                }
            } else {
                stack.push(index);
            }
        }
        System.out.println(count);

    }
}
