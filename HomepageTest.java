import org.example.Homepage;
import com.shaft.driver.SHAFT;
import org.example.Main;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomepageTest {

    SHAFT.GUI.WebDriver driver;
    By dis=By.xpath("//*[@id=\"statusMsg\"]/font");

    @BeforeClass
    public void beforeClass() {
        driver=new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("http://192.168.1.70/auth/login");
    }

    @Test
    public void AddDiscount(){
        Main login =new Main(driver);
        login.loginvalid();
        Homepage home =new Homepage(driver);
        home.launchmasterpage();
        home.gotoruleEnginepage();
        home.launchservicecharge();
        home.DiscountPage();
        String expected="Discount Created Successfully";
        String actual=driver.element().getText(dis);
        Assert.assertEquals(expected,actual);
    }
}
