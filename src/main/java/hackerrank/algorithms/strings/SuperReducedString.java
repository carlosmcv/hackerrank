package hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * Created by carlosmcv on 14/08/16.
 * https://www.hackerrank.com/challenges/reduced-string
 */
public class SuperReducedString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int beforeLenght = -1;
        int afterLenght = -2;

        while (beforeLenght != afterLenght) {
            beforeLenght = s.length();
            s = reduce(s);
            if (s == null || s.trim().equals("") || s.trim().length() == 0) {
                s = "Empty String";
                break;
            }
            afterLenght = s.length();
        }
        System.out.println(s);
    }

    private static String reduce(String s) {

        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);

        for (int i = 1; i <= s.length(); i++) {
            if (i != s.length()) {
                if (c == s.charAt(i)) {
                    sb.append(s.substring(i + 1));
                    return sb.toString();
                } else {
                    sb.append(c);
                }
            } else {
                sb.append(c);
                break;
            }

            c = s.charAt(i);
        }
        return sb.toString();
    }

}
