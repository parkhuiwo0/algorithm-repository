package lecture.dynamicProgramming;

import java.util.Scanner;

/**
 * acmicpc.net/problem/11727 2xN 타일링 - 2
 * 2xN 직사각형을 1x2, 2x1, 2x2 타일로 채우는 방법의 수를 구하는 문제
 * D[N] = 2xN 직사각형을 채우는 방법의 수
 * D[N] = D[N-1] + D[N-2] + D[N-2]
 */
public class BOJ11727 {

    public static void main(String[] args) {
        int[] d;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        d = new int[n + 1];

        d[0] = 1;
        d[1] = 1;

        for (int i = 2; i<=n; i++) {
            d[i] = (d[i-1] + d[i-2]*2);
            d[i] %= 10007;
        }

        System.out.println(d[n]);

    }
}
