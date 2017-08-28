import org.apache.log4j.Logger;
import org.apache.xpath.SourceTree;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by Dimon on 24.08.2017.
 */
public class HomePage extends BasePage {

    private static final Logger log = Logger.getLogger(HomePage.class.getName());

    private final String xpath = ".//*[@class='auth-box__input'";

    @FindBy(xpath = ".//*[@class='auth-bar__item auth-bar__item--text']")
    WebElement loginButton;
    @FindBy(xpath = xpath + "and@type='text']")
    WebElement emailTextField;
    @FindBy(xpath = xpath + "and@type='password']")
    WebElement passwordTextField;
    @FindBy(xpath = ".//*[@class='auth-box__auth-submit auth__btn auth__btn--green']")
    WebElement sighInButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openLoginForm() throws InterruptedException {
        log.info("'Вход' button clicked");
        loginButton.click();
        Thread.sleep(1000);
    }

    public void loginInApp(String email, String password) throws InterruptedException {
        log.info("entered email " + email + "  in the email text field");
        emailTextField.sendKeys(email);
        log.info("entered password " + password + " in the password text field");
        passwordTextField.sendKeys(password);
        log.info("'Войти' button clicked");
        sighInButton.click();
        Thread.sleep(1000);
    }

    public boolean checkOpenHomePage(){
        try {
            Assert.assertTrue(driver.getCurrentUrl().contains("www.onliner.by"));
            log.info("Cheching that Onliner opened");
            return true;
        } catch (Exception e) {
            log.error("Onliner no opened");
            return false;
        }
    }
}
