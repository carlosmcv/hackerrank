package hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by carlosmcv on 14/08/16.
 * https://www.hackerrank.com/challenges/a-very-big-sum
 */
public class AVeryBigSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        long totalSum = 0L;

        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
            totalSum += arr[arr_i];
        }
        System.out.println(totalSum);
    }
}
