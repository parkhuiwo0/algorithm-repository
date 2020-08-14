package lecture.dataStructure;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

/**
 * acmicpc.net/problem/17298 오큰수
 * 어떤 수 Aj번째에 대해서 이 수가 오큰수인 수를 찾아보려고 한다. Ai에 대해서 Aj를 찾는 것이 아니라,
 * 이 성질을 이용해서 오큰수를 스택을 이용해서 찾아보려고 한다.
 */
public class BOJ17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        int[] numbers = new int[count];
        int[] answer = new int[count];
        Stack<Integer> stack = new Stack<>();

        String[] temp = br.readLine().split(" ");

        // 초기화
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(temp[i]);
        }
        stack.push(0);

        for (int i = 1; i < count; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
            }

            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i]; // 여기서 꺼내구만
            }
            stack.push(i);
        }

        while (!stack.empty()) {
            answer[stack.pop()] = -1;
        }

        for (int i = 0; i<count; i++) {
            bw.write(answer[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
