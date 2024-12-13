import com.shaft.driver.SHAFT;
import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest {
    SHAFT.GUI.WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver=new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("http://192.168.1.70/auth/login");
    }

    @Test
    public void registervalid(){
        Main login =new Main(driver);
        login.loginvalid();
        String actual=driver.browser().getCurrentURL();
        String expected="http://192.168.1.70/auth/login";
        Assert.assertEquals(actual,expected);
    }
}
