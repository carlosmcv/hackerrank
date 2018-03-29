package hackerrank.velocitytest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlosmcv on 14/08/16.
 */
public class Solution {


    public static void main(String[] args) throws IOException {




//        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;
        int _n;
//        _n = Integer.parseInt(in.nextLine());

        _n = 100;

        res = printPrimeFibonacciNumbers(_n);

        for (int res_i = 0; res_i < res.length; res_i++) {

            System.out.println(res[res_i]);
        }

    }


    static int[] printPrimeFibonacciNumbers(int n) {
        //To generate the next Prime int number, call the existing method: PrimeGenerator.getNext();
        //To generate the next Fibonacci int number, call the existing method: FibonacciGenerator.getNext();

        List<Integer> fibs = new ArrayList<Integer>();
        List<Integer> primes = new ArrayList<Integer>();

        List<Integer> primesAndFibs = new ArrayList<Integer>();

        int fib = FibonacciGenerator.getNext();
        int pri = PrimeGenerator.getNext();


        while (pri <= n) {
            primes.add(new Integer(pri));
            pri = PrimeGenerator.getNext();
        }

        while (fib <= n) {
            fibs.add(new Integer(fib));
            fib = FibonacciGenerator.getNext();
        }


        for (Integer prime : primes) {
            for (Integer fibo : fibs) {
                if (fibo.equals(prime)) {
                    primesAndFibs.add(fibo);
                    break;
                }
            }
        }

//        System.out.println(fibs);
//        System.out.println(primes);
//        System.out.println(primesAndFibs);

        int[] primesAndFibsArray = new int[primesAndFibs.size()];

        for (int i = 0; i < primesAndFibsArray.length; i++) {
            primesAndFibsArray[i] = primesAndFibs.get(i).intValue();
        }

        return primesAndFibsArray;
    }


}


