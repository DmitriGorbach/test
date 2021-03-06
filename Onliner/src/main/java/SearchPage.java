import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Dimon on 24.08.2017.
 */
public class SearchPage extends BasePage {

    @FindBy (xpath = ".//*[@class='fast-search__input']")
    WebElement searchField;
    @FindBy (xpath = ".//*[@class='product__title-link']")
    WebElement searchResult;

    public SearchPage(WebDriver driver){
        super(driver);
    }

    public void searchProduct(String product) throws InterruptedException {
        searchField.sendKeys(product);
        Thread.sleep(1000);
    }

    public void checkSearchResult(){
        searchResult.click();
    }
}
//.//*[@class='b-main-navigation__text'][contains( text(),'Каталог')]