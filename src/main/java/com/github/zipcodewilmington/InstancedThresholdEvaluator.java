package com.github.zipcodewilmington;

public class InstancedThresholdEvaluator {
    /**
     * Write a method named `getThreshold` which returns `threshold` instance variable
     * @return `this.threshold`
     */
    public Integer getThreshold() {
        return null;
    }

    /**
     * Write a method named `setThreshold` which sets `threshold` instance variable
     * @param thresholdToBeSet - value to set `threshold` field
     */ // TODO - ensure respective `SetThresholdTest` passes
    public void setThreshold(Integer thresholdToBeSet) {
    }

    /**
     * Write a method named `isThresholdReached` which returns `true` if
     * its second integer parameter, `limit`, is greater than `getThreshold()`.
     *
     * @param limit     - the value to compare against `threshold`
     * @return `true` if `limit` is greater than `threshold`
     */ // TODO - Create a respective test in the `StaticThresholdEvaluatorTest` class
    public Boolean isThresholdReached(Integer limit) {
        return null;
    }

    /**
     * Write a method named `isThresholdExceeding` which returns `true` if
     * its second integer parameter, `limit`, is less than `getThreshold()`
     *
     * @param limit     - the value to compare against `threshold`
     * @return `true` if `limit` is greater than `threshold`
     */ // TODO - Ensure the respective tests in the `StaticThresholdEvaluatorTest` class passes
    public Boolean isThresholdExceeding(Integer limit) {
        return null;
    }
}
