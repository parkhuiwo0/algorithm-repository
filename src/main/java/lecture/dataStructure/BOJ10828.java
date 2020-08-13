package lecture.dataStructure;

import java.util.Scanner;

/**
 * 스택 자료구조를 구현
 * url : https://www.acmicpc.net/problem/10828
 */
public class BOJ10828 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] stack = new int[n];

        int size = 0;

        while (n-- > 0) {
            String cmd = sc.next();
            if (cmd.equals("push")) {
                int num = sc.nextInt();
                stack[size++] = num;
            } else if (cmd.equals("top")) {
                if (size == 0) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack[size-1]);
                }
            } else if (cmd.equals("size")) {
                System.out.println(size);
            } else if (cmd.equals("empty")) {
                if (size == 0) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (cmd.equals("pop")) {
                if (size == 0) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack[size-1]);
                    size -= 1;
                }
            }
        }

    }
}
