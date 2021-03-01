package seleniumEssay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class LoginPage {
    public static WebDriver driver;
    public void lunchBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\DD\\selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://smallseotools.com/plagiarism-checker/");
        Thread.sleep(5000);
    }

    public void uploadFile() throws AWTException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[contains(@class,'input-group-addon img_input_addon glyphicon glyphicon-link new')]")).click();

        StringSelection stringSelection = new StringSelection("Desktop\\shrisha reddy resume.docx");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        //native key strokes for CTRL, V and ENTER keys
        Robot robot = new Robot();
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(5000);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
