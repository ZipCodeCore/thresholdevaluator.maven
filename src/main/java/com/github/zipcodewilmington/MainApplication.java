package com.github.zipcodewilmington;

import java.util.StringJoiner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApplication {
    private final static Logger logger = Logger.getLogger(StaticThresholdEvaluator.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Hello World!");
        logger.log(Level.SEVERE, "Terrible Error!");
        logger.log(Level.WARNING, "Not So Bad Error!");
        logger.log(Level.INFO, new StringJoiner("\n")
                .add("****")
                .add("\tAt ZipCode, ")
                .add("\twe don't use System.out.Println")
                .add("\tuntil we've earned the right.")
                .add("****")
                .toString());
    }
}
