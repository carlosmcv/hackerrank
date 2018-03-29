package hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by carlosmcv on 01/09/16.
 */
public class TheBombermanGameBit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int C = in.nextInt();
        int N = in.nextInt();

        long[] grid = new long[R];
        long[][] grids = {
                new long[R],
                new long[R]
        };
        int n = 0;

//        System.out.println("++ Input Grid ++");
        for (int i = 0; i < R; i++) {
            String line = in.next();
            for (int j = 0; j < line.length(); j++) {
                ///System.out.print(line.charAt(j));
                grid[i] |= ( line.charAt(j) == 79 ? 1 << C-j-1 : 0 );
                grids[0][i] = grid[i];
            }
            //System.out.println();
        }

        //drawGrid(grid, C);
        //System.exit(0);

//        System.out.println();
//        System.out.println("++ Loaded Bit Grid ++");
//        System.out.println();
//
//        drawBitGrid(grid);
//
//        System.out.println();
//        System.out.println("++ Loaded Grid ++");
//        System.out.println();
//
//        drawGrid(grid, C);

        /////////////////////////
        long aux[][];
        int p = 0;
        int e = 0;
        n = 2;

        while (n <= N) {
            //System.out.println("second: " + n);

            if (n % 2 == 0) {
                //System.out.println("planting grid : " + ((++p) % 2));
                aux = plantGrid(grid, C);
                grid = aux[0];
                grids[++p%2] = aux[1];
                //System.out.println("---mainGrid---");
                //drawGrid(grid, C);
                //System.out.println("---plantedGrid " + (p%2) +"---");
                //drawGrid(grids[p % 2], C);
            } else {
                //System.out.println("exploding grid: " + (e%2));
                //System.out.println("---plantedGrid " + (e%2) +"---");
                //drawGrid(grids[e%2], C);
                grid = explodeGrid(grid, grids[e%2], C);
                //System.out.println("---mainGrid---");
                //drawGrid(grid, C);
                e++;
            }
            //System.out.println();
            n++;
        }

        drawGrid(grid, C);


    }

    private static long[][] plantGrid(long[] mGrid, int width) {

        long mask;
        long[] pGrid = new long[mGrid.length];

        for (int i = 0; i < mGrid.length; i++) {
            for (int j = 0 ; j < width; j++) {
                mask = 1 << width-j-1;
                if ((mGrid[i] & mask) == 0) {
                    mGrid[i] |= mask;
                    pGrid[i] |= mask;
                }
            }
        }

        return new long[][]{mGrid, pGrid};
    }

    private static long[] explodeGrid(long[] mGrid, long[] eGrid, int width) {

        int mask;

        for (int i = 0; i < mGrid.length; i++) {
            for (int j = 0 ; j < width; j++) {
                mask = 1 << width-j-1;
                if ((eGrid[i] & mask) != 0) {
                    // explode bomb site
                    mGrid[i] &= ~mask;
                    // explode bomb up place
                    if (i-1 >= 0) {
                        mGrid[i-1] &= ~mask;
                    }
                    // explode bomb down place
                    if (i+1 < mGrid.length) {
                        mGrid[i+1] &= ~mask;
                    }
                    // explode bomb left place
                    if ((mask << 1) <= (1 << width)) {
                        mGrid[i] &= ~(mask << 1);
                    }
                    // explode bomb right site
                    if (mask > 1) {
                        mGrid[i] &= ~(mask >> 1);
                    }
                }
            }
        }

        return mGrid;
    }



    private static void drawGrid(long[] grid, int width) {
        long mask;
        for (long x : grid) {
            for (int i = 0 ; i < width; i++) {
                mask = 1 << width-i-1;
                System.out.print((x & mask) != 0 ? "O" : ".");
            }
        System.out.println();
        }
    }

    private static void drawBitGrid(long[] grid) {
        for (long x : grid) {
            System.out.println(Long.toString(x, 2));
        }
    }
}
