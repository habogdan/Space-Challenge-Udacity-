package com.company;

public interface SpaceShip {

    boolean launch(boolean launch_status);
    boolean land(boolean land_status);
    boolean canCarry ( Item object);
    void carry ( Item object);
}
