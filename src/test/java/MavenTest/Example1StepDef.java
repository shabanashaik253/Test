package MavenTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1StepDef {

    private static WebDriver driver;
    @When("^I enter google url$")
    public void i_enter_google_url() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SRINIDHI\\Downloads\\Browsers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
        driver.manage().window().maximize();
    }

    @Then("^google page should open$")
    public void google_page_should_open() throws Throwable {

        System.out.println("GOOGLE PAGE OPENED SUCCESSFULLY......!!!!");
        driver.close();
    }

}
