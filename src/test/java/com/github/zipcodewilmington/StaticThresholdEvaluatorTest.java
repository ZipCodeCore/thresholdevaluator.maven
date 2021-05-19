package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StaticThresholdEvaluatorTest {
    // given
    @ParameterizedTest
    @ValueSource(ints = {0, 5, 10, Integer.MIN_VALUE})
    public void testIsThresholdExceedingTrue(int thresholdToBeSet) {
        Integer valueToCompareAgainstThreshold = thresholdToBeSet + 1;

        // when
        boolean actual = StaticThresholdEvaluator.isThresholdExceeding(thresholdToBeSet, valueToCompareAgainstThreshold);

        // then
        Assert.assertTrue(actual);
    }

    // given
    @ParameterizedTest
    @ValueSource(ints = {0, 5, 10, Integer.MAX_VALUE})
    public void testIsThresholdExceedingFalse(int thresholdToBeSet) {
        Integer valueToCompareAgainstThreshold = thresholdToBeSet - 1;

        // when
        boolean actual = StaticThresholdEvaluator.isThresholdExceeding(thresholdToBeSet, valueToCompareAgainstThreshold);

        // then
        Assert.assertFalse(actual);
    }
}