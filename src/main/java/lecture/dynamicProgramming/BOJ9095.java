package lecture.dynamicProgramming;

import java.util.Scanner;

/**
 * acmicpc.net/problem/9095 1,2,3 더하기
 * d[n] = n 을 1과 2와 3의 합으로 나타내는 방법의 수
 * d[n] = d[n-1] + d[n-2] + d[n-3]
 * 맨 오른쪽에 1이 올 경우 + 맨 오른쪽에 2가 올 경우 + 맨 오른쪽에 3이 올 경우
 * D[0]에는 어떤 값을 채워 넣으면 좋을지에 대해서 고민해봐야 한다.
 *
 */
public class BOJ9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] d = new int[11]; // n은 11보다 작은 정수이기 때문
        d[0] = 1;

        for (int i=1; i<=10; i++) {
            for (int j=1; j<=3; j++) {
                if (i-j >= 0) {
                    d[i] += d[i-j];
                }
            }
        }

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(d[n]);
        }

    }
}
