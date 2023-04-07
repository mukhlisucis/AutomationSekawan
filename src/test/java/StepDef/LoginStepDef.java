package StepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.pageObject.LoginPage;

public class LoginStepDef {
    private WebDriver webDriver;
    public LoginStepDef(){
        super();
        this.webDriver=Hooks.webDriver ;
    }

    @When("^user input username \"([^\"]*)\"$")
    public void userInputUsername(String username) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.inputUsername(username);
    }

    @And("^user input password \"([^\"]*)\"$")
    public void userInputPassword(String passw) {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.inputPassword(passw);
    }

    @And("^user click button Masuk$")
    public void userClickButtonMasuk() throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickSubmit();
        Thread.sleep(3000);
    }


    @Then("^user redirect on homepage and see \"([^\"]*)\"$")
    public void userRedirectOnHomepageAndSee(String selamat) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(selamat, loginPage.pesanSelamat());
        Thread.sleep(1000);

    }

    @Given("^user already on landing page \"([^\"]*)\"$")
    public void userAlreadyOnLandingPage(String login) {
        LoginPage loginPage = new LoginPage(webDriver);
        Assert.assertEquals(login, loginPage.getLogin());

    }
}
