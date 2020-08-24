package lecture.dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * acmicpc.net/problem/11053 가장 긴 증가하는 부분 수열
 * 일반적인 점화식을 세우는 Dynamic과 다른 배열을 채워주는 방식으로 풀 수 있음.
 */
public class BOJ11053 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] numbers = new int[length];
        int[] lis_result = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < length; i++) {
            lis_result[i] = 1;
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[i] && lis_result[i] < lis_result[j] + 1) {
                    lis_result[i] = lis_result[j] + 1;
                }
            }
        }

        Arrays.sort(lis_result);
        System.out.println(lis_result[length-1]);
    }
}
