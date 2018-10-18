package stepsDef;

import com.cucumberTest.bo.BaseBO;
import com.cucumberTest.bo.HomeBO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountCreation {
//    private HomeBO homeBO = new HomeBO();

    @Given("I am on Facebook registration page with title {string}")
    public void i_am_on_Facebook_login_page(String expectedTitle) {
//        String actualTitle = homeBO.navigateToHomePage();
//        assert actualTitle.equals(expectedTitle) :
//                String.format("Failed : Expected title is %s, but actual title is %s", expectedTitle, actualTitle);
        System.out.println(expectedTitle);
    }

    @When("I enter name as {string} and lastname as {string}")
    public void i_enter_username_and_lastname_as(String firstName, String lastName) {
//        homeBO.setFirstAndLastName(firstName, lastName);
        System.out.println(firstName + " " + lastName);
    }

    @When("I enter email or tel as {string} and password as {string}")
    public void i_enter_login_and_passord_as(String emailOrTel, String password) {
        System.out.println(emailOrTel + " " + password);
    }

    @When("I enter DoB as {string} and SEX as {string}")
    public void i_enter_DoB_and_SEX_as(String DoB, String SEX) {
        System.out.println(DoB + " " + SEX);
    }

    @When("I click registration button")
    public void i_click_registration_button() {
        System.out.println("Click button");
    }

    @Then("I should see {string}")
    public void i_should_see_message(String message) {
        System.out.println(message);
    }
}
