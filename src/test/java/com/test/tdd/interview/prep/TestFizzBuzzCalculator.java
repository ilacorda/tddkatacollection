package com.test.tdd.interview.prep;

import com.tdd.interview.prep.FizzBuzzCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFizzBuzzCalculator {

    /*
     * STEP 1
     * Write a class that produces the following for any contiguous range of integers 1 -20:
     * - Multiples of 3 print out "Fizz" instead of the corresponding number
     * - Multiples of 5 print out "Buzz" instead of the corresponding number
     * - Mulitples of 15 print "FizzBuzz" instead of the corresponding number
     *
     *  Be careful regarding trailing spaces
     *
     *  Here is the set:
     *
     *  1 == 1
     *  2 == 2
     *  3 == Fizz
     *  4 == 4
     *  5 == Buzz
     *  6 == Fizz
     *  7 == 7
     *  8 == 8
     *  9 == Fizz
     *  10 == Buzz
     *  11 == 11
     *  ... 12
     *  15 == FizzBuzz
     *  100 == Buzz
     *
     * STEP 2
     * If the number contains a three you must output the text ‘lucky’. This overrides any existing behaviour, as follows:
     *
     * 1
     * 2
     * Lucky
     * 4
     * Buzz
     * Fizz
     * 7
     * 8
     * Fizz
     * Buzz
     * 11
     * Fizz
     * Lucky
     * 14
     * Fizzbuzz
     * 16
     * 17
     * Fizz
     * 19
     * Buzz
     *
     */

    private FizzBuzzCalculator fizzBuzzCal;


    @Before
    public void testGlobalSetup() throws Exception {
        fizzBuzzCal = new FizzBuzzCalculator();

    }

    @Test
    public void testFizzBuzzCalculatorLeavesAloneNormalNumber() {

        assertEquals("1", fizzBuzzCal.convert(1));
        assertEquals("2", fizzBuzzCal.convert(2));
        assertEquals("7", fizzBuzzCal.convert(7));

        //We are not exhausting the full list of number that are not multiple of 3, 5, or 15
    }

    @Test
    public void testFizzBuzzCalculatorReturnsFizzForMultiplesOfThree() {
        String expectedValueMultiplesOfThree = "Lucky";
        assertEquals(expectedValueMultiplesOfThree, fizzBuzzCal.convert(3));

    }

    @Test
    public void testFizzBuzzCalculatorReturnsFizzForMultiplesOfFive() {
        String expectedValueMultiplesOfFive = "Buzz";
        assertEquals(expectedValueMultiplesOfFive, fizzBuzzCal.convert(5));

    }

    @Test
    public void testFizzBuzzCalculatorReturnsFizzBuzzForMultiplesOfThreeAndFive() {
        String expectedValueMultiplesOfFifteen = "FizzBuzz";
        assertEquals(expectedValueMultiplesOfFifteen, fizzBuzzCal.convert(15));

    }

    @Test
    public void testFizzBuzzCalculatorReturnsLucyIfContainsThree() {
        String expectedValueWhenContainsThree = "Lucky";
        assertEquals(expectedValueWhenContainsThree, fizzBuzzCal.convert(30));
        assertEquals(expectedValueWhenContainsThree, fizzBuzzCal.convert(13));
        assertEquals(expectedValueWhenContainsThree, fizzBuzzCal.convert(33));

    }
}
