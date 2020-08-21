package lecture.dynamicProgramming;

import java.util.Scanner;

/**
 * acmicpc.net/problem/2193 이친수
 * D[N][L] = N자리 이친수의 수 (마지막에 온 숫자는 L)
 */
public class BOJ2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] d = new long[n+1][2];

        d[1][0] = 0;
        d[1][1] = 1;

        for (int i=2; i<=n; i++) {
            for (int j=0; j<=1; j++) {

                if (j==0) {
                    d[i][j] += d[i-1][j] + d[i-1][j+1];
                }

                if (j==1) {
                    d[i][j] += d[i-1][j-1];
                }
            }
        }

        System.out.println(d[n][0] + d[n][1]);

    }
}
