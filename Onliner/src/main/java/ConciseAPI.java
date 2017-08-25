import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class ConciseAPI {

    public abstract WebDriver getWebdriver();

    public void open(String url){
        getWebdriver().get(url);
    }

    public void assertThat(ExpectedCondition<Boolean> condition){
        (new WebDriverWait(getWebdriver(), 4)).until(condition);
    }

}
