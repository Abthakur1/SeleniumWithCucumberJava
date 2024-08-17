package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StepDefSauceDemo {
    private final WebDriver driver = new ChromeDriver();

    @Given("^I launch the app with url as \"([^\"]*)\"$")
    public void launch(String url) {
        driver.get(url);
    }

    @When("^I enter username in username field$")
    public void iEnterUsernameInUsernameField() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

    }

    @And("^I enter password in password field$")
    public void iEnterPasswordInPasswordField() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();

    }

    @Then("^I verify the successful login$")
    public void iVerifyTheSuccessfulLogin() {
        WebElement productIcon = driver.findElement(By.xpath("//div[text()='Products']"));
        boolean display = productIcon.isDisplayed();
        Assert.assertTrue(display);
    }

    @Given("I test with username as {} and password as {}")
    public void iTestWithUsernameAsAndPasswordAs(String uName, String pswd) {
        System.out.println(uName);
        System.out.println(pswd);
    }
}
