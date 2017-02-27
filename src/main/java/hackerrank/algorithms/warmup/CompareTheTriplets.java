package hackerrank.algorithms.warmup;

/**
 * Created by carlosmcv on 14/08/16.
 * https://www.hackerrank.com/challenges/compare-the-triplets
 */

import java.util.Scanner;

public class CompareTheTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int[] aScores = {a0, a1, a2};
        int[] bScores = {b0, b1, b2};

        int aTotalScore = 0;
        int bTotalScore = 0;

        for (int i = 0; i < aScores.length; i++) {
            if (aScores[i] != bScores[i]) {
                if (aScores[i] > bScores[i]) {
                    aTotalScore += 1;
                } else {
                    bTotalScore += 1;
                }
            }
        }

        System.out.println(aTotalScore + " " + bTotalScore);
    }


}
