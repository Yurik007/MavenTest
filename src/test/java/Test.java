import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test
{
    @org.testng.annotations.Test
    public void FirstTest()
    {
        System.setProperty("webdriver.chrome.driver" ,  "D://IntelliJ IDEA Community Edition 2019.1/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
    }
}
