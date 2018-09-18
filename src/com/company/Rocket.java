package com.company;

public class Rocket implements SpaceShip {

    public boolean launch(boolean launch_status) {
        if (launch_status)
            return true;
        else
            return false;
    }

    public boolean land(boolean land_status) {
        if (land_status)
            return true;
        else
            return false;
    }

    public boolean canCarry ( Item object){
        if ( capacity <= object.weight)
            return true;
        else
            return false;
    }

    public void carry ( Item object) {
        capacity += object.weight;
    }
}
