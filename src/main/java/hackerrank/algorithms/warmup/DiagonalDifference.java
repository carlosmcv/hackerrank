package hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by carlosmcv on 14/08/16.
 * https://www.hackerrank.com/challenges/diagonal-difference
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];

        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }

        int diag1Sum = 0;
        int diag2Sum = 0;

        for (int d = 0; d < n; d++) {
            diag1Sum += a[d][d];
            diag2Sum += a[n - d - 1][d];
        }

        int diagnalDifference = Math.abs(diag1Sum - diag2Sum);
        System.out.println(diagnalDifference);
    }
}
