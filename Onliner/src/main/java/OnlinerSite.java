import org.openqa.selenium.WebDriver;

public class OnlinerSite {

    WebDriver driver;

    public OnlinerSite(WebDriver driver){
        this.driver = driver;
    }

    public HomePage homePage(){
        return new HomePage(driver);
    }

    public SearchPage searchPage(){
        return new SearchPage(driver);
    }
}
