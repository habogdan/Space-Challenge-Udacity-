package com.company;

import java.util.Random;

public class U2 extends Rocket {

    public U2() {
        cost = 120;
        weight = 18000000;
        max_weight = 29000000;
    }

    public boolean launch() {
        Random generator = new Random();
        float randome = generator.nextFloat();

        if (randome > ( 0.04 * ( weight / max_weight)))
            return true;
        else
            return false;
    }

    boolean land(boolean land_status) {
        Random generator = new Random();
        float randome = generator.nextFloat();

        if (randome > ( 0.08 * ( weight / max_weight)))
            return true;
        else
            return false;
    }
}
