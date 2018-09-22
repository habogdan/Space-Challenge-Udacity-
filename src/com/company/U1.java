package com.company;

import java.sql.SQLOutput;
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
        float trashold = 0.5f * ( (float)weight / (float)max_weight);
        if (randome < trashold)
            return true;
        else
            return false;
    }

    public boolean land() {
        Random generator = new Random();
        float randome = generator.nextFloat();
        float trashold = 0.5f * ( (float)weight / (float)max_weight);
        if (randome < trashold)
            return true;
        else
            return false;
    }
}
