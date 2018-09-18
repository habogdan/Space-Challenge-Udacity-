package com.company;

public class U1 extends Rocket {

    boolean launch(boolean launch_status) {
        if (launch_status)
            return true;
        else
            return false;
    }

    boolean land(boolean land_status) {
        if (land_status)
            return true;
        else
            return false;
    }
}
