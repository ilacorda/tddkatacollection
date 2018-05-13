package com.test.tdd.interview.prep;

/*
 * Kata steps:
 * 1-An empty string returns zero
 * 2-A single number returns the value
 * 3-Two numbers, comma delimited, returns the sum
 * 4-Two numbers, newline delimited, returns the sum
 * 5-Three numbers, delimited either way, returns the sum
 * 6-Negative numbers throw an exception
 */

import com.tdd.interview.prep.StringCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestStringCalculator {

    private StringCalculator stringCalculator;
    private int expectedTwoNumsSum;
    private int expectedThreeNumsSum;

    @Before
    public void testGlobalSetup() {
        stringCalculator = new StringCalculator();
        expectedTwoNumsSum = 2 + 5;
        expectedThreeNumsSum = 2 + 5 + 5;
    }

    @Test
    public void testEmptyStringReturnsZero() throws Exception {

        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void testSingleNumberReturnsExpectedValue() throws Exception {

        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    public void testTwoNumbersCommaDelimitersReturnSum() throws Exception {

        assertEquals(expectedTwoNumsSum, stringCalculator.add("2,5"));

    }

    @Test
    public void testTwoNumberNewLinesReturnSum() throws Exception {

        assertEquals(expectedTwoNumsSum, stringCalculator.add("2\n5"));

    }

    @Test
    public void testThreeNumberCommaDelimiterOrNewLinesReturnSum() throws Exception {

        assertEquals(expectedThreeNumsSum, stringCalculator.add("2,5,5"));
        assertEquals(expectedThreeNumsSum, stringCalculator.add("2\n5\n5"));
        assertEquals(expectedThreeNumsSum, stringCalculator.add("2,5\n5"));
        assertEquals(expectedThreeNumsSum, stringCalculator.add("2\n5,5"));

    }

    @Test(expected = Exception.class)
    public void testNegativeNumberThrowsAnException() throws Exception {

        stringCalculator.add("-1");

    }

}
