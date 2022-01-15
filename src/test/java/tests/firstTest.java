package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
        WebDriver driver= new ChromeDriver();
//         for the firefox laucnh
//        WebDriver driver= new FirefoxDriver();

        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        WebElement fullName= driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("HUSOAGA");

        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        email.click();
        email.sendKeys("ramazan@gmail.com");

        WebElement address = driver.findElement(new By.ByCssSelector(".form-control[placeHolder='Current Address']"));
        address.click();
        address.sendKeys("İstasyon, Atatürk Cd., 46800 Türkoğlu/Kahramanmaraş");

        WebElement permanentAddress= driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("İstasyon, Atatürk Cd., 46800 Türkoğlu/Kahramanmaraş");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        
        WebElement submitButton= driver.findElement(By.id("submit"));
        submitButton.click();


    }
}
