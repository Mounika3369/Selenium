package seleniumEssay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import java.util.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class SeleniumEssayLinka {

    public static void main(String[] args) throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "D:\\DD\\selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/");
        Thread.sleep(10000);
        System.out.println("heading displayed");
        driver.findElement(By.xpath("//a[@id='at-cv-lightbox-close']")).click();
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='panel-body']//li[@class='tree-branch']/a"));
        System.out.println("links size : "+links.size());
        for (int i=0;i<links.size();i++){
            System.out.println("Link : "+i+" : "+links.get(i).getText());
            if (links.get(i).getText().equalsIgnoreCase("Table")){
                links.get(i).click();
            }
        }

    }
}
