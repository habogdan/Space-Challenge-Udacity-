package com.company;

public class Rocket implements SpaceShip {

    public int cost;
    public int weight;
    public int max_weight;
    public float launch_explosion;
    public float land_explosion;

    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry ( Item object){
        if ( weight <= object.weight)
            return true;
        else
            return false;
    }

    public void carry ( Item object) {
        weight += object.weight;
    }
}
