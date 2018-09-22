package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulation {

    private Scanner readMyFile(String filePath) {

        Scanner fileScanner = null;
        try{
            File file = new File(filePath);
            fileScanner = new Scanner(file);
        }
        catch(FileNotFoundException exception){
            System.out.println("File not found!");
        }
        return fileScanner;
    }
    public List<Item> loaditems (String filePath){
        Scanner fileScanner = readMyFile(filePath);
        ArrayList<Item> list = new ArrayList<>();
        while(fileScanner.hasNextLine())
        {
            String obj = fileScanner.nextLine();
            String[] arr = obj.split("=");
            list.add(new Item(arr[0], Integer.parseInt(arr[1])));
        }
        return list;
    }

    public List<Rocket> loadU1 (ArrayList<Item> list){
        ArrayList<Rocket> list_u1 = new ArrayList<>();
        U1 u1 = new U1();
        for ( Item  it : list )
        {
            if(!u1.canCarry(it)){
                list_u1.add(u1);
                u1 = new U1();
            }
            if(u1.canCarry(it)){
                u1.carry(it);
            }
        }
        list_u1.add(u1);

        return list_u1;
    }

    public List<Rocket> loadU2 (ArrayList<Item> list){
        ArrayList<Rocket> list_u2 = new ArrayList<>();
        U2 u2 = new U2();
        for ( Item  it : list )
        {
            if(!u2.canCarry(it)){
                list_u2.add(u2);
                u2 = new U2();
            }
            if(u2.canCarry(it)){
                u2.carry(it);
            }
        }
        list_u2.add(u2);

        return list_u2;
    }

    public int runSimulation ( ArrayList<Rocket> list){
        int totalBuget = 0;
        for ( int i = 0; i < list.size(); i++ ) {
            boolean launch = list.get(i).launch();
            boolean land = list.get(i).land();
            if ( launch && land) {
                totalBuget += list.get(i).cost;
            }

            else {
                totalBuget += list.get(i).cost;
                i--;
            }
        }
        return totalBuget;
    }
}
