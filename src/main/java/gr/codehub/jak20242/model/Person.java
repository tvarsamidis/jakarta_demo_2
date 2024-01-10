package gr.codehub.jak20242.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {

    private static final Logger logger = LoggerFactory.getLogger(Person.class);

    public static void main(String[] args) {
        logger.info("Program started");
        int i = 4 * 23456;
        System.out.println(i);
        logger.warn("Program {} finished", i);
    }
}
