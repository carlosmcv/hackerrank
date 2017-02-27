package hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * Created by carlosmcv on 27/08/16.
 * https://www.hackerrank.com/challenges/camelcase
 */
public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int wordsNum = 0;

        for (int i = 0; i < s.length() ; i++) {

            if (i == 0) {
                wordsNum++;
                continue;
            }

            if (Character.isUpperCase(s.charAt(i))) {
                wordsNum++;
            }
        }

        System.out.println(wordsNum);

    }
}
