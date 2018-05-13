package com.test.tdd.interview.prep;

import com.tdd.interview.prep.PrimeFactorsCalculator;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class TestPrimeFactorsCalculator {

    private PrimeFactorsCalculator primeFactorsCalculator;

    @Before
    public void testGlobalSetup() {
        primeFactorsCalculator = new PrimeFactorsCalculator();

    }

    @Test
    public void testOneHasNotPrimeFactor() {
        assertEquals(Collections.emptyList(), primeFactorsCalculator.computePrimeFactors(1));
    }

    @Test
    public void testTwoHasOnlyItselfAsPrimeFactor() {
        assertEquals(Arrays.asList(2), primeFactorsCalculator.computePrimeFactors(2));
    }

    @Test
    public void testThreeHasOnlyItselfAsPrimeFactor() {
        assertEquals(Arrays.asList(3), PrimeFactorsCalculator.computePrimeFactors(3));
    }

    @Test
    public void testFourHasTwoTimesTwoAsPrimeFactor() {
        assertEquals(Arrays.asList(2, 2), PrimeFactorsCalculator.computePrimeFactors(4));
    }

    @Test
    public void testFiveHasOnlyItselfAsPrimeFactor() {
        assertEquals(Arrays.asList(5), PrimeFactorsCalculator.computePrimeFactors(5));
    }

    @Test
    public void testSixHasTwoAndThreeAsPrimeFactor() {
        assertEquals(Arrays.asList(2, 3), PrimeFactorsCalculator.computePrimeFactors(6));
    }

    //Skipping 7

    @Test
    public void testEightHasThreeTimesTwoAasPrimeFactor() {
        assertEquals(Arrays.asList(2, 2, 2), PrimeFactorsCalculator.computePrimeFactors(8));
    }

    @Test
    public void testNineHasTwoTimesThreeAsPrimeFactor() {
        assertEquals(Arrays.asList(3, 3), PrimeFactorsCalculator.computePrimeFactors(9));
    }

    @Test
    public void testTenHasTwoAndFiveAsPrimeFactor() {
        assertEquals(Arrays.asList(2, 5), PrimeFactorsCalculator.computePrimeFactors(10));
    }
}
