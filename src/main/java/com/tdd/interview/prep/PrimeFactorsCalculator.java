package com.tdd.interview.prep;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsCalculator {
    public static List<Integer> computePrimeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        for (int candidate = 2; number > 1; candidate++) {
            while (number % candidate == 0) {
                factors.add(candidate);
                number /= candidate;
            }
        }
        return factors;

    }

}
