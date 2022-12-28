import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sachi\\Downloads\\sachindec\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://ieltsmodernisation.inspera.com/admin#home");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.findElement(By.id("userName")).sendKeys("sachin_user");

        driver.findElement(By.id("password")).sendKeys("Testing@123");

        driver.findElement(By.xpath("//button[@class='btn btn-primary login-btn']/span")).click();

        driver.findElement(By.xpath("//i[@class='fa fa-cog']")).click();
        driver.findElement(By.xpath("//a[@class='logout-link']")).click();


        //driver.close();

    }
}
