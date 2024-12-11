package org.example;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    String name = "Virat";
    boolean value = false;

    @Test

    public void sample(){

        Assert.assertNotEquals(name, "Virat");
    }
}
