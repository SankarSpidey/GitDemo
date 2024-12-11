package org.example;

import org.testng.annotations.Test;

public class Car {

    @Test(priority = 0)
    public void startTheCar(){
        System.out.println("Start the car");
    }

    @Test(priority = 5, enabled = false)
    public void startMusic(){
        System.out.println("Start the Music");
    }

    @Test(priority = 1)
    public void firstGear(){
        System.out.println("1");
    }

    @Test(priority = 2)
    public void secondGear(){
        System.out.println("2");
    }

    @Test(priority = 3)
    public void thirdGear(){
        System.out.println("3");
    }

    @Test(priority = 4)
    public void fourthGear(){
        System.out.println("4");
    }

}
