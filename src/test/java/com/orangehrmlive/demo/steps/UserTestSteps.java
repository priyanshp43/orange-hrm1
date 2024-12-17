package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.ViewSystemUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class UserTestSteps {

    @And("I click on Admin tab")
    public void iClickOnAdminTab() {
        new HomePage().clickOnAdminLink();
    }

    @And("I should see The System Users text")
    public void iShouldSeeTheSystemUsersText() {
        Assert.assertEquals(new ViewSystemUserPage().getSystemUserText(), "System Users");
    }

    @And("I click on Add button")
    public void iClickOnAddButton() {
        new ViewSystemUserPage().clickAddButton();

    }

    @And("I should see the Add User text")
    public void iShouldSeeTheAddUserText() {
        Assert.assertEquals(new ViewSystemUserPage().getAddUserText(), "Add User");
    }

    @And("I select User Role as Admin")
    public void iSelectUserRoleAsAdmin() {
        new AddUserPage().mouseHoverAndClickOnUserRole();
        new AddUserPage().cLickOnAdminOptionInUserRole();
    }

    @And("I enter Employee Name {string}")
    public void iEnterEmployeeName(String username) throws InterruptedException {
        new ViewSystemUserPage().enterEmployeeName();
    }

    @And("I enter User Name {string}")
    public void iEnterUserName(String userName) {
        new ViewSystemUserPage().enterUserNameField(userName);
    }

    @And("I select Status as Disable")
    public void iSelectStatusAsDisable() throws InterruptedException{
        new ViewSystemUserPage().selectDisableOption();
    }

    @And("I enter Password {string} in create user")
    public void iEnterPasswordInCreateUser(String password) {
        new ViewSystemUserPage().enterPass(password);
    }

    @And("I enter Confirm Password {string} in create User")
    public void iEnterConfirmPasswordInCreateUser(String confirmPassword) {
        new ViewSystemUserPage().enterConfirmPass(confirmPassword);
    }

    @And("I click on Save button")
    public void iClickOnSaveButton() {
        new ViewSystemUserPage().clickOnSaveButton();
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String message) {
        Assert.assertEquals(new ViewSystemUserPage().getSuccessText(), "Successfully Saved");
    }

    @And("I enter user name {string} in system users page")
    public void iEnterUserNameInSystemUsersPage(String userName) {
        new ViewSystemUserPage().sendDataToUserNameField(userName);

    }


    @And("I select status as disable in system users page")
    public void iSelectStatusAsDisableInSystemUsersPage() {
        new ViewSystemUserPage().clickOnStatusDropDown();
        new ViewSystemUserPage().mouseHoverAndCLickOndDisableStatusOption();
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        new ViewSystemUserPage().clickOnSearchButton();
    }

    @Then("I should verify the user name {string} in result list")
    public void iShouldVerifyTheUserNameInResultList(String expectedUserName) {
        Assert.assertEquals(new ViewSystemUserPage().getDataFromUserNameInRecord(), expectedUserName);
    }

    @And("I select user role as Admin in system users page")
    public void iSelectUserRoleAsAdminInSystemUsersPage() {
        new ViewSystemUserPage().clickOnUserRoleDropDown();
        new ViewSystemUserPage().mouseHoverAndClickOnAdminOptionInUserRole();
    }

    @And("I click on check box against the user name")
    public void iClickOnCheckBoxAgainstTheUserName() {
        new ViewSystemUserPage().clickOnCheckBox();
    }

    @And("I click on delete button against the user name")
    public void iClickOnDeleteButtonAgainstTheUserName() {
        new ViewSystemUserPage().clickOnDeleteSelectedOption();
    }

    @And("I click on ok button on popup")
    public void iClickOnOkButtonOnPopup() {
        new ViewSystemUserPage().clickOnYesDeleteOption();
    }

    @Then("I should get successfully deleted message {string}")
    public void iShouldGetSuccessfullyDeletedMessage(String arg0) {
    }

    @And("I enter user role {string} in system users page")
    public void iEnterUserRoleInSystemUsersPage(String userName) {
        new ViewSystemUserPage().clickOnUserRoleDropDown();
        if (userName == "Admin") {
            new ViewSystemUserPage().mouseHoverAndClickOnAdminOptionInUserRole();
        } else {
            new ViewSystemUserPage().mouseHoverAndClickOnESSOptionInUserRole();
        }
    }

    @And("I enter employee name {string} in system users page")
    public void iEnterEmployeeNameInSystemUsersPage(String employeeName) {
        new ViewSystemUserPage().clickOnUserRoleDropDown();
        if (employeeName == "Paul Collings") {
            new ViewSystemUserPage().mouseHoverAndClickOnAdminOptionInUserRole();
        } else {
            new ViewSystemUserPage().mouseHoverAndClickOnESSOptionInUserRole();
        }
    }

    @And("I select status {string} in system users page")
    public void iSelectStatusInSystemUsersPage(String status) {
        new ViewSystemUserPage().clickOnStatusDropDown();
        if (status == "Enabled") {
            new ViewSystemUserPage().mouseHoverAndCLickOndEnableStatusOption();
        } else {
            new ViewSystemUserPage().mouseHoverAndCLickOndDisableStatusOption();
        }
    }

    @And("I see the one record found {string} message")
    public void iSeeTheOneRecordFoundMessage(String arg0) {
    }

    @And("I should verify the username {string}")
    public void iShouldVerifyTheUsername(String arg0) {
    }

    @Then("I click on reset button")
    public void iClickOnResetButton() {
        new ViewSystemUserPage().clickOnResetButton();
    }
}
