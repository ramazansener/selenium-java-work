package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
        WebDriver driver= new ChromeDriver();
//         for the firefox laucnh
//        WebDriver driver= new FirefoxDriver();

        driver.get("https://www.hepsiburada.com/");

    }
}
