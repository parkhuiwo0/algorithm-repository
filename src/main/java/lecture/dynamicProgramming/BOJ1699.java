package lecture.dynamicProgramming;

import java.util.Scanner;

/**
 * acmicpc.net/problem/1699 제곱수의 합
 * 작은 문제들을 다 더하면 최소 개수, 최소 값을 구하면 최소 값, 최대값을 구하면 최대값
 * 마지막에 오는 경우가 너무 많으므로, 따로 변수를 세워서 해결하는 문제임.
 */
public class BOJ1699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n+1];

        for (int i=1; i<=n; i++) {
            d[i] = i; // 정답이 i를 넘길 수 없기 때문에 i로 초기화 해주는 것 !
            for (int j=1; j*j <= i; j++) {
                if (d[i] > d[i-j*j] + 1) {
                    d[i] = d[i-j*j] + 1;
                }
            }
        }
        System.out.println(d[n]);
    }
}
