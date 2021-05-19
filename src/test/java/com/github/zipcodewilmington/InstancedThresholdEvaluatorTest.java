package com.github.zipcodewilmington;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class InstancedThresholdEvaluatorTest {
    // given
    @ParameterizedTest
    @ValueSource(ints = {0, 5, 10, Integer.MAX_VALUE, Integer.MIN_VALUE})
    public void testSetThreshold(int thresholdToBeSet) {
        int expected = thresholdToBeSet;
        InstancedThresholdEvaluator thresholdEvaluator = new InstancedThresholdEvaluator();

        // when
        thresholdEvaluator.setThreshold(thresholdToBeSet);
        int actual = thresholdEvaluator.getThreshold();

        // then
        Assertions.assertEquals(expected, actual);
    }

    // given
    @ParameterizedTest
    @ValueSource(ints = {0, 5, 10, Integer.MIN_VALUE})
    public void testIsThresholdExceedingTrue(int thresholdToBeSet) {
        testIsThresholdExceeding(thresholdToBeSet, 1, false);
    }

    // given
    @ParameterizedTest
    @ValueSource(ints = {0, 5, 10, Integer.MAX_VALUE})
    public void testIsThresholdExceedingFalse(int thresholdToBeSet) {
        testIsThresholdExceeding(thresholdToBeSet, -1, true);
    }

    // given
    private void testIsThresholdExceeding(int thresholdToBeSet, int thresholdOffset, boolean expected) {
        Integer valueToCompareAgainstThreshold = thresholdToBeSet + thresholdOffset;
        InstancedThresholdEvaluator thresholdEvaluator = new InstancedThresholdEvaluator();
        thresholdEvaluator.setThreshold(thresholdToBeSet);

        // when
        boolean actual = thresholdEvaluator.isThresholdExceeding(valueToCompareAgainstThreshold);

        // then
        Assertions.assertEquals(expected, actual);
    }
}
