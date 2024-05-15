import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();

        driver.get("https://in.linkedin.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.id("session_key")).sendKeys("suraj.nagarale2@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys("Sweet@0202");
        driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']")).click();

        Thread.sleep(4000);

        driver.findElement(By.xpath("(//span[text()='Messaging'])[1]")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Hi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Send']")).click();

        //Thread.sleep(5000);

        //driver.quit();


    }
}
