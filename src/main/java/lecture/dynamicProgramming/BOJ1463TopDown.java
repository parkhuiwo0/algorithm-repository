package lecture.dynamicProgramming;

import java.util.Scanner;

/**
 * Created by Huiwoo Park
 * User: common
 * Date: 2020/08/13
 * Time: 3:04 오후
 */
public class BOJ1463TopDown {
//    public static int[] d;

//    public static int go(int n) {
//        if (n==1) return 0;
//
//        if (d[n] > 0) {
//            return d[n];
//        }
//
//        d[n] = go(n-1) + 1;
//
//        if (n%2 == 0) {
//            int temp = go(n/2) + 1;
//            if (d[n] > temp) d[n] = temp;
//        }
//
//        if (n%3 == 0) {
//            int temp = go(n/3) + 1;
//            if (d[n] > temp) d[n] = temp;
//        }
//        return d[n];
//    }

    static int[] memorization;

    static int go(int number) {
        if (number == 1) return 0;

        memorization[number] = go(number-1) + 1;

        if (number%2 == 0) {
            int temp = go(number/2) + 1;
            if (memorization[number] > temp) {
                memorization[number] = temp;
            }
        }

        if (number%3 == 0) {
            int temp = go(number/3) + 1;
            if (memorization[number] > temp) {
                memorization[number] = temp;
            }
        }

        return memorization[number];
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        d = new int[n+1];
//        System.out.println(go(n));

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        memorization = new int[number + 1];
        System.out.println(go(number));

    }
}
