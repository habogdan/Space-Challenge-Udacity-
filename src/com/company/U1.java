package com.company;

import java.util.Random;

public class U1 extends Rocket {
    public U1() {
        cost = 100;
        weight = 10000000;
        max_weight = 18000000;
    }

    public boolean launch() {
        Random generator = new Random();
        float randome = generator.nextFloat();

        if (randome > ( 0.05 * ( weight / max_weight)))
            return true;
        else
            return false;
    }

    boolean land(boolean land_status) {
        Random generator = new Random();
        float randome = generator.nextFloat();

        if (randome > ( 0.01 * ( weight / max_weight)))
            return true;
        else
            return false;
    }
}
