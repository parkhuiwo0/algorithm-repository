package lecture.dynamicProgramming;

import java.util.Scanner;

/**
 * Created by Huiwoo Park
 * User: common
 * Date: 2020/08/13
 * Time: 2:31 오후
 */
// Bottom Up
public class BOJ1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int memorization[] = new int[n + 1];
        memorization[1] = 0;
        for (int i = 2; i<=n; i++) {
            memorization[i] = memorization[i-1] + 1;

            if (i%2 == 0 && memorization[i] > memorization[i/2] + 1) {
                memorization[i] = memorization[i/2] + 1;
            }

            if (i%3 == 0 && memorization[i] > memorization[i/3] + 1) {
                memorization[i] = memorization[i/3] + 1;
            }
        }
        System.out.println(memorization[n]);
    }
}
