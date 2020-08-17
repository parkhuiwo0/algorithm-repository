package lecture.dynamicProgramming;

import java.io.IOException;
import java.util.Scanner;

/**
 * acmicpc.net/problem/11726 [2xN 타일링]
 * 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * D[N] = 2xn 크기의 직사각형을 채우는 방법의 수
 * 문제에서 제한을 준 케이스.
 * 가장 오른쪽에 타일을 채우는 방법이 2가지인데 각각 크기가 2xD[N-1]과 2xD[N-2]
 * D[N] = D[N-1] + D[N-2]
 */
public class BOJ11726 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n+1];
        d[0] = 1;
        d[1] = 1;

        for (int i =2; i<=n; i++) {
            d[i] = (d[i-1] + d[i-2])%10007;
        }

        System.out.print(d[n]);
    }
}
