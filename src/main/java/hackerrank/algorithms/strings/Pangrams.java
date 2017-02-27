package hackerrank.algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by carlosmcv on 27/08/16.
 * https://www.hackerrank.com/challenges/pangrams
 */
public class Pangrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        //String s = "We promptly judged antique ivory buckles for the next prize";
        //String s = "We promptly judged antique ivory buckles for the prize";
        //String s = "We promptly judged antique ivory buckles for the next prize";

        Set<Integer> alphabeth = new HashSet<Integer>();
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 32) {
                alphabeth.add(new Integer(s.charAt(i)));
            }
        }

        if (alphabeth.size() == 26) {
            System.out.println("pangram");

        } else if (alphabeth.size() < 26) {
            System.out.println("not pangram");
        }

        /*int i = 0;
        for(char c : s.toCharArray()) {
            int x = Character.toUpperCase(c);
            if (x >= 'A' && x <= 'Z') {
                i |= 1 << (x - 'A');
            }
        }
        if (i == (i | ((1 << (1 + 'Z' - 'A')) - 1))) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }*/


        /*
        int bits = 0;
        s = s.toUpperCase();
        for (char c : s.toCharArray()) {

            if (c != 32) {
                bits = bits | (1 << (c - 'A'));
                System.out.println(c + " -> " + Integer.toBinaryString(bits));
            }
        }

        if ( bits == ((1 << 26) - 1)) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        };
        */
    }
}
