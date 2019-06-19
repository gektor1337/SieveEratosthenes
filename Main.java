package com.company.;

import java.util.ArrayList;
import java.util.List;



public class SieveEratosthenes {


    public static void main(String[] args) {
        List<Integer> l = getPrimeArray(1000000);
        System.out.println(l);
    }


    public static <limit> List<Integer> getPrimeArray(limit) {
        boolean[] sieve = new boolean[limit + 1];
        List<Integer> primes = new ArrayList<Integer>(limit + 1);
        int p = 2;
        while (p * p <= limit) {
            sieve[p * p] = true;
            int multiple = p * p;

            while (multiple <= limit) {
                sieve[multiple] = true;
                multiple += p;
            }

            for (int i = p + 1; i <= limit; i++) {
                if (!sieve[i]) {
                    p = i;
                    break;
                }
            }
        }

        for (int i = 2; i <= limit; i++) {
            if (!sieve[i]) {
                primes.add(i);
            }
        }
        primes;
    }
}