package hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by carlosmcv on 01/09/16.
 */
public class TheBombermanGame {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int R = in.nextInt();
        int C = in.nextInt();
        int N = in.nextInt();

        boolean[][] grid = new boolean[R][C];
        boolean[][][] grids = {
                new boolean[R][C],
                new boolean[R][C]
        };
        boolean[][][] finalGrids = new boolean[4][R][C];
        int n = 0;

//        System.out.println("++ Input Grid ++");
        for (int i = 0; i < R; i++) {
            String line = in.next();
            for (int j = 0; j < C; j++) {
//                System.out.print(line.charAt(j));
                grid[i][j] = (line.charAt(j) == 79);
                grids[0][i][j] = grid[i][j];
                finalGrids[1][i][j] = grid[i][j];
            }
//            System.out.println();
        }

//        System.out.println();
//        System.out.println("++ Loaded Grid ++");
//        System.out.println();
//        drawGrid(grid);
//        System.out.println();

        int p = 0;
        int e = 0;
        n = 2;

        while (n <= Math.min(N,5)) {
//            System.out.println("second: " + n);

            if (n % 2 == 0) {
                ++p;
//                System.out.println("planting grid : " + (p % 2));
                grids[p % 2] = plantGrid(grid);
//                System.out.println("---mainGrid---");
//                drawGrid(grid);
//                System.out.println("---plantedGrid " + (p % 2) + "---");
//                drawGrid(grids[p % 2]);
            } else {
//                System.out.println("exploding grid: " + (e % 2));
//                System.out.println("---plantedGrid " + (e % 2) + "---");
//                drawGrid(grids[e % 2]);
                explodeGrid(grid, grids[e % 2], grids[p % 2]);
//                System.out.println("---Exploding mainGrid---");
//                drawGrid(grid);
                e++;
            }


            finalGrids[n%4] = cloneArray(grid);

            /*System.out.println("\nn = " + n);
            drawGrid(grid);*/

            n++;
        }

        drawGrid(finalGrids[N % 4]);
    }

    private static boolean[][] plantGrid(boolean[][] mGrid) {

        boolean[][] pGrid = new boolean[mGrid.length][mGrid[0].length];

        for (int i = 0; i < mGrid.length; i++) {
            for (int j = 0; j < mGrid[i].length; j++) {
                if (!mGrid[i][j]) {
                    mGrid[i][j] = true;
                    pGrid[i][j] = true;
                }
            }
        }
        return pGrid;
    }

    private static void explodeGrid(boolean[][] mGrid, boolean[][] eGrid, boolean[][] pGrid) {

        for (int i = 0; i < mGrid.length; i++) {
            for (int j = 0; j < mGrid[i].length; j++) {

                if (eGrid[i][j]) {
                    // explode bomb site
                    mGrid[i][j] = false;
                    // explode bomb up place
                    if (i - 1 >= 0) {
                        mGrid[i - 1][j] = false;
                        pGrid[i - 1][j] = false;
                    }
                    // explode bomb down place
                    if (i + 1 < mGrid.length) {
                        mGrid[i + 1][j] = false;
                        pGrid[i + 1][j] = false;
                    }
                    // explode bomb left place
                    if (j - 1 >= 0) {
                        mGrid[i][j - 1] = false;
                        pGrid[i][j - 1] = false;
                    }
                    // explode bomb right site
                    if (j + 1 < mGrid[i].length) {
                        mGrid[i][j + 1] = false;
                        pGrid[i][j + 1] = false;
                    }
                }
            }
        }
    }


    private static void drawGrid(boolean[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] ? "O" : ".");
            }
            if (i < grid.length - 1) {
                System.out.println();
            }
        }
    }

    private static boolean[][] cloneArray(boolean[][] src) {
        int length = src.length;
        boolean[][] target = new boolean[length][src[0].length];
        for (int i = 0; i < length; i++) {
            System.arraycopy(src[i], 0, target[i], 0, src[i].length);
        }
        return target;
    }

    private static boolean equalsMatrix(boolean[][] a, boolean[][] b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

}
