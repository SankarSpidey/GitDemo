package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SampleProgram {

    @Test
    public void loginTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selinium Webdriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchBox.sendKeys("samsung s23 ultra");
        searchButton.click();

        List<WebElement> productNames = driver.findElements(By.xpath("//div[@class=\"a-section a-spacing-none puis-padding-right-small s-title-instructions-style\"]"));
        String productColor = "Phantom Black, 8GB, 128GB Storage";

        for(WebElement name : productNames){
            String actualProduct = name.getText();
            if(actualProduct.contains(productColor) ){
               name.click();
            }
        }

        Set<String> windows = driver.getWindowHandles();
        for(String newWindow : windows){
            driver.switchTo().window(newWindow);
        }

        WebElement productTitle = driver.findElement(By.xpath("//span[@id='productTitle']"));
        WebElement productPrice = driver.findElement(By.xpath("//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']//span[@aria-hidden='true']"));
        String price = productPrice.getText();
        String productName = productTitle.getText();
        System.out.println("Product Name :"+ productName);
        System.out.println("Product Price :"+ price);
    }
}
