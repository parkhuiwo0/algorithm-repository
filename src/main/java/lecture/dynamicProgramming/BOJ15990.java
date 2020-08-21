package lecture.dynamicProgramming;

import java.util.Scanner;

/**
 * acmicpc.net/problem/15990 1,2,3 더하기 5
 * 배운 것 : "연속"이라는 추가 조건이 붙었을 경우 DP에서 표현하는 방법
 * D[i][j] = i를 1,2,3의 합으로 나타내는 방법의 수, 마지막에 사용한 수는 j
 * D[i-1][2] + D[i-1][3]
 * D[i-2][1] + D[i-2][3]
 * D[i-3][1] + D[i-3][2]
 *
 * 초기화에 대해서도 신경써주어야 한다. 아무것도 사용하지 않은 것을 사용하면 중복이 발생해서 초기화해주어야 한다.
 * 첫 번째 수인경우와 아닌경우로 에외 처리해주어야 한다.
 */
public class BOJ15990 {
    static final long mod = 1000000009L;
    static final int limit = 100000;
    static long[][] d = new long[limit+1][4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i=1; i<=limit; i++) {
            if (i-1 >= 0) {
                d[i][1] = d[i-1][2] + d[i-1][3];
                if (i == 1) {
                    d[i][1] = 1;
                }
            }

            if (i-2 >= 0) {
                d[i][2] = d[i-2][1] + d[i-2][3];
                if (i == 2) {
                    d[i][2] = 1;
                }
            }

            if (i-3 >= 0) {
                d[i][3] = d[i-3][1] + d[i-3][2];
                if (i == 3) {
                    d[i][3] = 1;
                }
            }
            d[i][1] %= mod;
            d[i][2] %= mod;
            d[i][3] %= mod;
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println((d[n][1] + d[n][2] + d[n][3])%mod);
        }
    }

}
