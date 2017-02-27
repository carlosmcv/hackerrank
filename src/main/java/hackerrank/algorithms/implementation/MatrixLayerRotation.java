package hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by carlosmcv on 27/08/16.
 * https://www.hackerrank.com/challenges/matrix-rotation-algo
 */
public class MatrixLayerRotation {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int r = in.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int numLayers = (int) Math.ceil(Math.min(m, n) / 2);

        for (int l = 0; l < numLayers; l++) {

            int layerSize = 2 * (m - (2 * l)) + 2 * (n - (2 * l)) - 4;
            int enoughRotations =  r % layerSize;

            for (int t = 0; t < enoughRotations; t++) {
                matrix = rotateMatrix(matrix, l);
            }
        }

        printMatrix(matrix);
    }

    private static int[][] rotateMatrix(int[][] matrix, int indexInit) {

        boolean[][] touchMatrix = new boolean[matrix.length][matrix[0].length];

        boolean hasPreviousVal = false;
        int previousVal = -1;
        int nextVal = -1;

        boolean hasPreviousVal2 = false;
        int previousVal2 = -1;
        int nextVal2 = -1;

        for (int i = indexInit; i < matrix.length - (indexInit); i++) {

            //v
            nextVal = matrix[i][indexInit];
            if (!touchMatrix[i][indexInit] && hasPreviousVal) {
                matrix[i][indexInit] = previousVal;
                touchMatrix[i][indexInit] = true;
            }
            previousVal = nextVal;
            hasPreviousVal = true;

            //^
            nextVal2 = matrix[matrix.length - i - 1][matrix[indexInit].length - indexInit - 1];

            if (!touchMatrix[matrix.length - i - 1][matrix[indexInit].length - indexInit - 1] && hasPreviousVal2) {
                matrix[matrix.length - i - 1][matrix[indexInit].length - indexInit - 1] = previousVal2;
                touchMatrix[matrix.length - i - 1][matrix[indexInit].length - indexInit - 1] = true;
            }
            previousVal2 = nextVal2;
            hasPreviousVal2 = true;
        }

        for (int j = indexInit; j < matrix[indexInit].length - (indexInit); j++) {

            //>
            if (j != indexInit) {
                nextVal = matrix[matrix.length - indexInit - 1][j];
            }

            if (!touchMatrix[matrix.length - indexInit - 1][j] && hasPreviousVal) {
                matrix[matrix.length - indexInit - 1][j] = previousVal;
                touchMatrix[matrix.length - indexInit - 1][j] = true;
            }
            previousVal = nextVal;
            hasPreviousVal = true;

            //<
            if (j != indexInit) {
                nextVal2 = matrix[indexInit][matrix[indexInit].length - j - 1];
            }

            if (!touchMatrix[indexInit][matrix[indexInit].length - j - 1] && hasPreviousVal2) {
                matrix[indexInit][matrix[indexInit].length - j - 1] = previousVal2;
                touchMatrix[indexInit][matrix[indexInit].length - j - 1] = true;
            }
            previousVal2 = nextVal2;
            hasPreviousVal2 = true;
        }

        return matrix;
    }


    private static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            if (i != 0) System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                if (j != 0) System.out.print(" ");
                System.out.print(matrix[i][j]);
            }
        }
    }


/*    private static void printTouchedMatrix(boolean[][] matrix) {
        System.out.println("---------------------------------------------");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }*/

}
