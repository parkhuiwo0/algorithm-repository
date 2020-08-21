package lecture.dynamicProgramming;

import java.util.Scanner;

/**
 * acmicpc.net/problem/10844 쉬운 계단 수
 * D[N][L] = 길이가 N인 계단 수
 * 마지막에 사용한 수가 L
 * 마지막 N번째에 L이라는 숫자를 사용했다면,
 * N-1번째 자리에 올 수 있는 수는 L-1혹은 L+1이다.
 */
public class BOJ10844 {
    final static long mod = 1000000000L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] d = new long[n+1][10];

        // 초기화
        for (int i=1; i<=9; i++) {
            d[1][i] = 1;
        }

        for (int i=2; i<=n; i++) {
            for (int j=0; j<=9; j++) {
                d[i][j] = 0;

                if (j-1 >= 0) {
                    d[i][j] += d[i-1][j-1];
                }

                if (j+1 <= 9) {
                    d[i][j] += d[i-1][j+1];
                }
                d[i][j] %= mod;
            }
        }

        long ans = 0;
        for (int i=0; i<=9; i++) {
            ans += d[n][i];
        }
        ans %= mod;
        System.out.println(ans);


    }
}
