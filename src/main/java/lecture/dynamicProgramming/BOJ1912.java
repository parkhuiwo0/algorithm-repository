package lecture.dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * acmicpc.net/problem/1912 연속합
 */
public class BOJ1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] numbers = new int[length]; // {1,2,3,4,5}
        int[] continuousSum = new int[length]; // {1,3,6,10,15}

        for (int i = 0; i<length; i++) {
            numbers[i] = sc.nextInt();
        }

        continuousSum[0] = numbers[0];

        for (int i = 1; i<length; i++) {
            continuousSum[i] = numbers[i];
            if (continuousSum[i] < numbers[i] + continuousSum[i-1]) {
                continuousSum[i] = numbers[i] + continuousSum[i-1];
            }
        }

        Arrays.sort(continuousSum);
        System.out.println(continuousSum[length-1]);

    }
}
