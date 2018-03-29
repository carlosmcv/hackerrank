package hackerrank.algorithms.implementation;

import java.util.Arrays;

/**
 * Created by carlosmcv on 30/08/16.
 */
public class Tests {

    public static void main(String[] args) {

        /*
        int m = 7;
        int n = 6;
        int r = 22;

        int numLayers = (int) Math.ceil(Math.min(m, n) / 2);

        System.out.println("numLayers = " + numLayers);

        for (int l = 0; l < numLayers; l++) {

            int layerSize = 2 * (m - (2 * l)) + 2 * (n - (2 * l)) - 4;
            int enoughRotations =  r % layerSize;

            System.out.println("layerSize = " + layerSize);
            System.out.println("enoughRotations = " + enoughRotations);

            *//*for (int t = 0; t < r; t++) {
                matrix = rotateMatrix(matrix, l);
            }*//*
        }
*/

        /*int n = 2;
        int N = 12;
        int p = 0;
        int e = 0;

        System.out.println("second: 0");
        System.out.println("planting grid : 0");
        System.out.println();

        System.out.println("second: 1");
        System.out.println("do nothing.");
        System.out.println();

        while (n < N) {
            System.out.println("second: " + n);

            if (n % 2 == 0) {
                System.out.println("planting grid : " + ((++p) % 2));
            } else {
                System.out.println("exploding grid: " + ((e++) % 2));
            }
            System.out.println();
            n++;
        }*/

        int[] arr = new int[10];

        System.out.println(Arrays.toString(arr));

        changeArray(arr);

        System.out.println(Arrays.toString(arr));
    }


    public static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            if (i % 2 == 0) {
                arr[i] = 1;
            }
        }
    }
}