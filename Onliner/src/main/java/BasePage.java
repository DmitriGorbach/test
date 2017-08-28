import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends ConciseAPI {

    public WebDriver driver;

    @Override
    public WebDriver getWebdriver() {
        return null;
    }

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
