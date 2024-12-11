package org.example;

import org.testng.annotations.Test;

public class DependencyManagement {

    @Test(enabled = true)
    public void primary(){
        System.out.println("Cleared primary");
    }

    @Test(dependsOnMethods = "primary")
    public void highSchool(){
        System.out.println("Cleared high school");
    }

    @Test(dependsOnMethods = "highSchool")
    public void College(){
        System.out.println("Cleared College");
    }
}
