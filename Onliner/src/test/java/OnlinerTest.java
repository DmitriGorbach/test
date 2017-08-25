import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Dimon on 24.08.2017.
 */
public class OnlinerTest extends BaseTest {

    OnlinerSite onlinerSite = new OnlinerSite(driver);

    String url = "https://www.onliner.by";
    String email = "Ditva@bk.ru";
    String password = "Aspideru2x2";
    String product = "telephone";


    @Test
    public void loginFormOpenTest() throws InterruptedException {
        open(url);
        Assert.assertTrue(driver.getCurrentUrl().contains("www.onliner.by"));
       // assertThat(textToBePresent);
        onlinerSite.homePage().openLoginForm();
        onlinerSite.homePage().loginInApp(email,password);
    }

     @Test
     public void searchAnyProductTest() throws InterruptedException {
        open(url);
        Assert.assertTrue(driver.getCurrentUrl().contains("www.onliner.by"));
        onlinerSite.searchPage().searchProduct(product);
     }

}
