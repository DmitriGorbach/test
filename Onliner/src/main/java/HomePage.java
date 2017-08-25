import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dimon on 24.08.2017.
 */
public class HomePage extends BasePage {

    private final String xpath =".//*[@class='auth-box__input'";

    @FindBy (xpath = ".//*[@class='auth-bar__item auth-bar__item--text']")
    WebElement loginButton;
    @FindBy (xpath = xpath + "and@type='text']")
    WebElement emailTextField;
    @FindBy (xpath = xpath + "and@type='password']")
    WebElement passwordTextField;
    @FindBy (xpath = ".//*[@class='auth-box__auth-submit auth__btn auth__btn--green']")
    WebElement sighInButton;

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void openLoginForm() throws InterruptedException {
        loginButton.click();
        Thread.sleep(1000);
    }

    public void loginInApp(String email, String password) throws InterruptedException {
        emailTextField.sendKeys(email);
        passwordTextField.sendKeys(password);
        sighInButton.click();
        Thread.sleep(1000);
    }
}
