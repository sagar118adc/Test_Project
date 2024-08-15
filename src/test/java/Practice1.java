import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Practice1 {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite ");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Printed before class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("printed before test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Printed Before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Printed after method");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("printed After Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("printed After class");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Printed AFTER SUITE");
    }
    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.getTitle();

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));

        textBox.sendKeys("Sagar118");
        submitButton.click();

        WebElement message = driver.findElement(By.id("message"));
        message.getText();

        driver.quit();
    }
}