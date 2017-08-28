import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Dimon on 24.08.2017.
 */
public class BaseTest extends ConciseAPI {

    private static String LOG_PROPERTIES_FILE = "./src/main/resources/Log4j.properties";
    private static final Logger log = Logger.getLogger(BaseTest.class.getName());

    WebDriver driver = new FirefoxDriver();

    public WebDriver getWebdriver() {
        return driver;
    }

    public void open(String url){
        log.info("Onliner opened on the home page");
        driver.get(url);
    }

    @BeforeMethod
    public void setUp(){
        init();
    }

    public void init(){
        ConfigProperties configProperties = new ConfigProperties(LOG_PROPERTIES_FILE);
        configProperties.init();
    }

    @AfterClass
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }

}
