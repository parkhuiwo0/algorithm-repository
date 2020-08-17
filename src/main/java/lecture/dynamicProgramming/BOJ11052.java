package lecture.dynamicProgramming;

import java.util.Scanner;

/**
 * acmicpc.net/problem/11052 카드구매하
 * D[n] = 카드 N개를 구매하는 비용의 최대값
 * "알 수 없음" 이라는 정보가 DP에서 어떻게 활용될 수 있는지에 대해서 알아보는 문제.
 * D[N] = max( D[N-i] + P[i] )
 * 제일 적은 개수 1개 <= i <= 경우에 따라 한번에 N개 N
 */
public class BOJ11052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] d = new int[n+1];

        for (int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                if (d[i] < d[i-j] + a[j]) {
                    d[i] = d[i-j] + a[j];
                }
            }
        }

        System.out.println(d[n]);
    }
}
