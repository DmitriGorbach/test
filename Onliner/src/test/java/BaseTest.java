import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

/**
 * Created by Dimon on 24.08.2017.
 */
public class BaseTest extends ConciseAPI {

    WebDriver driver = new FirefoxDriver();

    public WebDriver getWebdriver() {
        return driver;
    }

    public void open(String url){
        driver.get(url);
    }

    @AfterClass
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }

}
