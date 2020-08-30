import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeOpen {
    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        //wd.get("https://www.google.com");
        wd.navigate().to("https://www.google.com");
    }

    @Test
    public void testChrome(){

    }
}
