package lecture.dynamicProgramming;

import java.util.Scanner;

/**
 * Created by Huiwoo Park
 * User: common
 * Date: 2020/08/13
 * Time: 2:31 오후
 */
public class BOJ1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] d = new int[n+1];
        d[1] = 0;
        for (int i=2; i<=n; i++) {
            d[i] = d[i-1] + 1;   // n-1

            if (i%2 == 0 && d[i] > d[i/2] +1) {
                d[i] = d[i/2] +1;  // n/2
            }
            if (i%3 == 0 && d[i] > d[i/3] +1) {
                d[i] = d[i/3] +1;  // n/3
            }
        }
        System.out.println(d[n]);
    }
}
