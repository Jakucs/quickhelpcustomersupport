package com.codecool;

import java.util.Random;

public class RandomDataGenerator {

    private static final Random random = new Random();
    public static final int MIN_STREET_NUMBER = 100;
    public static final int MAX_STREET_NUMBER = 1000;
    public static final int MIN_HOUSE_NUMBER = 1;
    public static final int MAX_HOUSE_NUMBER = 100;

    public String generateRandomStreetAddress() {
        return "Random Street "
                + random.nextInt(MIN_STREET_NUMBER, MAX_STREET_NUMBER)
                + " Number " + random.nextInt(MIN_HOUSE_NUMBER, MAX_HOUSE_NUMBER);
    }

    public int randomZipcode(){
        int randomNumber = random.nextInt(1000, 10000);
        return randomNumber;
    }
}
