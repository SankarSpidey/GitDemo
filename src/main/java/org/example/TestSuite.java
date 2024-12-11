package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuite {
    WebDriver driver;
    long startTime;
    long endTime;
    long totalTime;

    @BeforeSuite
    public void openBrowser(){
        startTime = System.currentTimeMillis();

        System.setProperty("webdriver.chrome.driver", "C:\\Selinium Webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void openGoogle(){
        driver.get("https://www.google.co.in/");
    }

    @Test
    public void openYahoo(){
        driver.get("https://in.search.yahoo.com/?fr2=inr");
    }

    @Test
    public void openBing(){
        driver.get("https://www.bing.com/");
    }

    @AfterSuite
    public void closeBrowser(){
        driver.quit();

        endTime = System.currentTimeMillis();
        totalTime = endTime-startTime;
        System.out.println("Total Time taken =" +totalTime);
    }

}
