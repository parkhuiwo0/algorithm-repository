package etc;

import java.util.Scanner;

/**
 * Created by Huiwoo Park
 * User: common
 * Date: 2020/08/25
 * Time: 3:20 오후
 */
public class Sum10Bada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt(); // 입력 받을 개수
        int[] numbers = new int[count + 1]; // 실제 문자 담을 배열
        int[] d = new int[11];


        d[0] = 1;
        for (int i=0; i<count; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i=1; i<=10; i++) {
            for (int j=0; j<numbers.length; j++) {
                if (i-numbers[j] >= 0) {
                    d[i] += d[i-numbers[j]];
                }
            }
        }

        System.out.println(d[10]);

    }
}
