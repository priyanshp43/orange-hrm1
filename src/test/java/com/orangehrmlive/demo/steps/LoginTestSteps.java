package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Objects;

public class LoginTestSteps {

    @Given("I am on HomePage")
    public void iAmOnHomePage() {

    }

    @When("I enter username {string}")
    public void iEnterUsername(String username) {
        new LoginPage().enterUsername(username);

    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should login successfully and verify the text {string}")
    public void iShouldLoginSuccessfullyAndVerifyTheText(String loginSuccessfully) {
        Assert.assertEquals(new DashboardPage().getDashboardText(), loginSuccessfully);

    }

    @Then("I should see the OrangeHRM logo")
    public void iShouldSeeTheOrangeHRMLogo() {
        Assert.assertEquals("", new DashboardPage().getOrangeLogo());
    }

    @And("I click on user profile logo")
    public void iClickOnUserProfileLogo() {
        new DashboardPage().clickOnUserProfileLogo();
    }

    @And("I mouse hover and click on Logout")
    public void iMouseHoverAndClickOnLogout() {
        new DashboardPage().mouseHoverAndClickOnLogOut();
    }

    @Then("I should navigate to login page and verify {string} text")
    public void iShouldNavigateToLoginPageAndVerifyText(String loginPageText) {
    }

    @Then("I should get error message {string} depends on username {string} and password {string}")
    public void iShouldGetErrorMessageDependsOnUsernameAndPassword(String errorMessage, String username, String password) {


        if (Objects.equals(username, "")) {
            Assert.assertEquals(new LoginPage().getUserNameFieldErrorMessage(), errorMessage);
        } else if (Objects.equals(password, "")) {
            Assert.assertEquals(new LoginPage().getPasswordFieldErrorMessage(), errorMessage);
        } else {
            Assert.assertEquals(new LoginPage().getInvalidCredentialErrorMessage(), errorMessage);
        }

    }
}

