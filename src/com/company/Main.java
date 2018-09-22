package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Simulation obj = new Simulation();
        ArrayList<Item> list = new ArrayList<>();
        ArrayList<Rocket> list_u1 = new ArrayList<>();
        list = (ArrayList<Item>) obj.loaditems("phase-1.txt");
        list_u1 = (ArrayList<Rocket>) obj.loadU1(list);
        System.out.print(obj.runSimulation(list_u1));

    }
}
