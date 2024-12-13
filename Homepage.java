package org.example;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;



public class Homepage {

    public Homepage(SHAFT.GUI.WebDriver driver){

        this.driver= driver;
    }

    SHAFT.GUI.WebDriver driver;
    By RuleEngine = By.xpath("//*[@id=\"Rules\"]/a");
    By Discount = By.xpath("//*[@id=\"accordion\"]/div[2]/a/div/h4");
    By Addbutton = By.xpath("//*[@id=\"add_click\"]");
    By Product = By.xpath("//*[@id=\"ruleGroupId\"]");
    By Discountname = By.xpath("//*[@id=\"discountName\"]");
    By Discountdescription = By.xpath("//*[@id=\"discountDesc\"]");
    By from = By.xpath("//*[@id=\"validFrom\"]");
    By to = By.xpath("//*[@id=\"validTo\"]");
    By datefrom = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a");
    By dateto = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]/a");
    By Remarks = By.xpath("//*[@id=\"remark\"]");
    By POS = By.xpath("//*[@id=\"createDiscountForm\"]/div[2]/div[6]/div[2]/div[1]/div[1]/div[1]/img");
    By Egypt = By.xpath("//*[@id=\"67\"]/input");
    By branch = By.xpath("//*[@id=\"createDiscountForm\"]/div[2]/div[6]/div[2]/div[2]/div[1]/div[1]/img");
    By branchname = By.xpath("//*[@id=\"10663\"]/input");
    By agency = By.xpath("//*[@id=\"createDiscountForm\"]/div[2]/div[6]/div[3]/div[1]/div[1]/div[1]/img");
    By agencyname = By.xpath("//*[@id=\"country_branch_agency\"]");
    By condition = By.xpath("//*[@id=\"entity_0\"]");
    By cond = By.xpath("//*[@id=\"optr_0\"]");
    By search = By.xpath("//*[@id=\"ssearch_0\"]/img");
    By airline = By.xpath("//*[@id=\"add_entity\"]/label[2]/input");
    By add = By.xpath("//*[@id=\"add_restricted_airline\"]");
    By save = By.xpath("//*[@id=\"save_airline\"]");
    By Fare = By.xpath("//*[@id=\"fare-type\"]");
    By amount = By.xpath("//*[@id=\"percentage_amount\"]");
    By value = By.xpath("//*[@id=\"markupVal\"]");
    By approve = By.xpath("//*[@id=\"sendApprovel\"]");
    By master = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div[1]/tilde-theme-navigation-header/div/ul/li[3]/a");
    By servicecharge = By.xpath("//*[@id=\"accordion\"]/div[3]/a/div/h4");



    public void launchmasterpage() {
        driver.element().click(master);
    }

    public void gotoruleEnginepage() {
        driver.element().click(RuleEngine);
    }

    public void launchservicecharge() {
        driver.element().click(servicecharge);
    }

    public void DiscountPage() {
        driver.element().click(Discount);
        driver.element().click(Addbutton);
        driver.element().select(Product, "Flight");
        driver.element().type(Discountname, "essp");
        driver.element().type(Discountdescription, "discountable");
        driver.element().click(from);
        driver.element().click(datefrom);
        driver.element().click(to);
        driver.element().click(dateto);
        driver.element().type(Remarks, "hello");
        driver.element().click(POS);
        driver.element().click(Egypt);
        driver.element().click(branch);
        driver.element().click(branchname);
        driver.element().click(agency);
        driver.element().click(agencyname);
        driver.element().select(condition, "Airline_Name");
        driver.element().select(cond, "IN");
        driver.element().click(search);
        driver.element().click(airline);
        driver.element().click(add);
        driver.element().click(save);
        driver.element().select(Fare, "Total Fare");
        driver.element().select(amount, "Amount");
        driver.element().click(value);
        driver.element().type(value, "5000");
        driver.element().click(approve);
    }
}
