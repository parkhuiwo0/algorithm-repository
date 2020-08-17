package lecture.dynamicProgramming;

import java.util.Scanner;

/**
 * acmicpc.net/problem/16194 카드 구매하기 2
 * 카드구매하기에서 max를 min으로 바꿔주면 될 것 같은데 그렇지 않다. 배열 D의 초기값을 잘 결정해주어야 한다.
 * 최소값을 구하는 경우에는 무조건 0으로 초기화해주는 것이 좋지 않다.
 * 첫 번째 방법은 카드의 개수가 최대 1000개고, 카드팩의 가격은 10000보다 작거나 같다이기 떄문에 1000*10000 혹은 전부 -1로 초기화 해준다.
 *
 */
public class BOJ16194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] d = new int[n+1];

        for (int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i=1; i<=n; i++) {
            d[i] = -1;
            for (int j=1; j<=i; j++) {
                if (d[i] == -1 || d[i] > d[i-j] + a[j]) {
                    d[i] = d[i-j] + a[j];
                }
            }
        }

        System.out.println(d[n]);
    }
}
