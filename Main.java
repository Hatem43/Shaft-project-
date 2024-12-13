package org.example;
import com.shaft.driver.SHAFT;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;


public class Main{

    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON testData;

    By username=By.xpath("//*[@id=\"id-Username\"]");
    By password=By.xpath("//*[@id=\"id-Password\"]");
    By loginbutton=By.xpath("/html/body/ndc-root/ndc-login-page/ndc-auth-container/div/div/div/ndc-auth-form-container/div/div[2]/ndc-fg-form-generator/form/div/div/button/span");


    public Main(SHAFT.GUI.WebDriver driver){

        this.driver= driver;
    }

    public void loginvalid() {

        testData=new SHAFT.TestData.JSON("E:\\Shaftproject\\src\\test\\resources\\testDataFiles\\simpleJSON.json");
        driver.element().type(username, testData.getTestData("name"));
        driver.element().type(password, testData.getTestData("password"));
        driver.element().click(loginbutton);
    }
}