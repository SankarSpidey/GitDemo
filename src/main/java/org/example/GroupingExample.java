package org.example;

import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = "CSK")
    public void cskPlayer1(){
        System.out.println("Dhoni");
    }

    @Test(groups = "CSK")
    public void cskPlayer2(){
        System.out.println("Jadeja");
    }

    @Test(groups = "CSK")
    public void cskPlayer3(){
        System.out.println("Ruturaj");
    }

    @Test(groups = "MI")
    public void mumbaiPlayer1(){
        System.out.println("Rohit");
    }

    @Test(groups = "MI")
    public void mumbaiPlayer2(){
        System.out.println("Bumrah");
    }

    @Test(groups = "RCB")
    public void rcbPlayer1(){
        System.out.println("Virat");
    }

    @Test(groups = "RCB")
    public void rcbPlayer2(){
        System.out.println("Abd");
    }

}
