import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

/**
 * Created by Dimon on 24.08.2017.
 */
public class OnlinerTest extends BaseTest {

    OnlinerSite onlinerSite = new OnlinerSite(driver);

    private static final Logger log = Logger.getLogger(OnlinerTest.class.getName());

    String url = "https://www.onliner.by";
    String email = "Ditva@bk.ru";
    String password = "Aspideru2x2";
    String product = "telephone";


    @Test
    public void loginFormOpenTest() throws InterruptedException {
        log.info("===Test started for checking user login===");
        open(url);
       // Assert.assertTrue(driver.getCurrentUrl().contains("www.onliner.by"));
        Assert.assertTrue(onlinerSite.homePage().checkOpenHomePage());
        //assertThat(textToBePresentInElement(driver.getCurrentUrl(),url));
        onlinerSite.homePage().openLoginForm();
        onlinerSite.homePage().loginInApp(email,password);
        log.info("===Test finished===");
    }

     @Test
     public void searchAnyProductTest() throws InterruptedException {
        log.info("===Test started for checking searching products===");
        open(url);
        Assert.assertTrue(driver.getCurrentUrl().contains("www.onliner.by"));
        onlinerSite.searchPage().searchProduct(product);
        //Assert.assertTrue(driver.findElement((By) onlinerSite.searchPage().searchResult).getSize() == 1);
        log.info("===Test finished===");
     }
}
