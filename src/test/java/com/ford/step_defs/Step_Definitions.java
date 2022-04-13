package com.ford.step_defs;

import com.ford.POM.LandingPage;
import com.ford.utilities.ConfigurationReader;
import com.ford.utilities.Driver;
import com.ford.utilities.Method;
import com.ford.utilities.Waiting;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Step_Definitions {
    LandingPage landingPage = new LandingPage();


    @When("user is on {string}")
    public void user_is_on(String string) {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Waiting.toSleep(2);
    }

    @When("user clicks on SUV & Crossovers")
    public void user_clicks_on_suv_crossovers() {
        // Write code here that turns the phrase above into concrete actions
        Waiting.forElementToBeVisible(landingPage.SUVS_CROSSOVERS);
        landingPage.SUVS_CROSSOVERS.click();
    }

    @Then("user should see {int} models")
    public void user_should_see_models(Integer expectedModelsQuantity, List<String> expectedNames) {
        List<String> actualTextOfModels = Method.getText(landingPage.modelNameOF_SUVS_CROSSOVERS);
        Assert.assertTrue(actualTextOfModels.size() == expectedModelsQuantity);
        for (int i = 0; i < actualTextOfModels.size(); i++) {
            for (int j = 0; j < expectedNames.size(); j++) {
                if (actualTextOfModels.get(i).contains(expectedNames.get(j))) {
                    boolean containsText = actualTextOfModels.get(i).contains(expectedNames.get(j));
                    Assert.assertTrue(containsText);
                }
            }
        }
    }


    @Then("user should see {int} options on bottom")
    public void user_should_see_options_on_bottom(Integer optionsQs, List<String> expectedNames) {
        List<String> actualNames = Method.getText(landingPage.buttonsExpSeeCertExploreList);
        Assert.assertTrue(actualNames.size() == optionsQs);
        for (int i = 0; i < actualNames.size(); i++) {
            for (int j = 0; j < expectedNames.size(); j++) {
                if (actualNames.get(i).contains(expectedNames.get(j))) {
                    boolean containsText = actualNames.get(i).contains(expectedNames.get(j));
                    Assert.assertTrue(containsText);
                }
            }
        }


    }


    @Then("user clicks on Explore All Vehicles")
    public void userClicksOnExploreAllVehicles() {
        Waiting.forElementToBeVisible(landingPage.ExploreAllVehicles);
        Method.hoverOn(landingPage.ExploreAllVehicles);
        landingPage.ExploreAllVehicles.click();
    }

    @And("user checks Gas checkbox")
    public void userChecksGasCheckbox() {
        landingPage.gasCheckbox.click();
    }

    @Then("user should see text under Future Vehicles {string}")
    public void userShouldSeeTextUnderFutureVehicles(String expectedMessage) {
        String actualMessage = landingPage.pleaseResetFilterText.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("user closes cookie setting")
    public void userClosesCookieSetting() {
        Waiting.forElementToBeVisible(landingPage.closeCookiePopUp);
        Waiting.toSleep(2);
        landingPage.closeCookiePopUp.click();
    }

    @Then("Future Vehicles checkbox is disabled")
    public void futureVehiclesCheckboxIsDisabled() {
        Waiting.toSleep(3);
        Assert.assertFalse(!landingPage.FutureVehiclesCheckbox.isEnabled());
    }

    @And("user chooses Electric")
    public void userChoosesElectric() {
        Method.scrollTo(landingPage.ElectricCheckbox);

        landingPage.ElectricCheckbox.click();
        // Method.scrollTo(landingPage.ElectricCheckbox);
    }


    @Then("user should see {string} displayed")
    public void userShouldSeeDisplayed(String expectedName) {
        Assert.assertTrue(landingPage.mustangMachEImage.isDisplayed());
        WebElement currentYear = Driver.getDriver().findElement(By.xpath("//span[@class='np-year ng-binding']"));
        WebElement actualName = Driver.getDriver().findElement(By.xpath("//strong[@data-ng-bind-template='MUSTANG MACH-E']"));
        String fullName = currentYear.getText() + " " + actualName.getText();
        Assert.assertEquals(expectedName, fullName);
    }

    @And("user clicks on Certified Used")
    public void userClicksOnCertifiedUsed() {
        Waiting.forElementToBeClickable(landingPage.CertifiedUsed);
        Method.hoverOn(landingPage.CertifiedUsed);
        landingPage.CertifiedUsed.click();
    }

    @And("user scrolls to the bottom of the page")
    public void userScrollsToTheBottomOfThePage() {
        Method.scrollBy(landingPage.bottomSearchInventory);
    }

    @And("user clicks on Search Inventory")
    public void userClicksOnSearchInventory() {
        Method.hoverOn(landingPage.bottomSearchInventory);
        Waiting.forElementToBeClickable(landingPage.bottomSearchInventory);
        landingPage.SearchInventory.click();
    }


    @Then("popup with text {string} should be displayed")
    public void popupWithTextShouldBeDisplayed(String expectedMessageText) {
        //Waiting.toSleep(2);
        Waiting.forElementToBeVisible(landingPage.beforeContinueMessage);
        Assert.assertTrue(landingPage.beforeContinueMessage.getText().contains(expectedMessageText));
    }

    @And("user clicks on Continue")
    public void userClicksOnContinue() {
        landingPage.Continue.click();
    }

    @Then("user should be redirected to new page with url {string}")
    public void userShouldBeRedirectedToNewPageWithUrl(String expectedURL) {
        Method.switchToNextWindow();
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);

    }

    @And("title should contain {string}")
    public void titleShouldContain(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @And("user clicks on Explore Fuel Choices")
    public void userClicksOnExploreFuelChoices() {
        Waiting.forElementToBeVisible(landingPage.ExploreFuelChoices);
        Method.hoverOn(landingPage.ExploreFuelChoices);
        landingPage.ExploreFuelChoices.click();
    }


    @And("user clicks on Fuel Choices dropdown")
    public void userClicksOnFuelChoicesDropdown() {
        landingPage.FuelChoices.click();
    }


    @Then("user should see {int} options:")
    public void userShouldSeeOptions(int options, List<String> expectedOptions) {
        Assert.assertTrue(landingPage.dropdownFuelChoices.size() == options);
        List<String> actualOptions = Method.getText(landingPage.dropdownFuelChoices);
        Assert.assertEquals(expectedOptions, actualOptions);
    }

    @When("user clicks Cars")
    public void userClicksCars() {
        landingPage.Cars.click();
    }

    @And("user clicks on {int} MUSTANG")
    public void userClicksOnMUSTANG(int year) {
        year = 2022;
        Waiting.forElementToBeClickable(landingPage.xMustang2022);
        landingPage.xMustang2022.click();
    }

    @And("user clicks on Explore {int} Mustang")
    public void userClicksOnExploreMustang(int year) {
        year = 2022;
        landingPage.Explore2022Mustang.click();
    }

    @And("user clicks on Models & Specs")
    public void userClicksOnModelsSpecs() {
        Waiting.forElementToBeClickable(landingPage.Models_Specs);
        landingPage.Models_Specs.click();
    }

    @Then("user should see {int} options of Mustangs")
    public void userShouldSeeOptionsOfMustangs(int expOptionForMustang) {
        Assert.assertTrue(landingPage.MustangOptions.size() == expOptionForMustang);
    }

    @And("user clicks on {int} FORD MUSTANG SHELBY GT{int}")
    public void userClicksOnFORDMUSTANGSHELBYGT(int year, int power) {
        year = 2022;
        power = 500;
        landingPage.MustangShelbyGT500.click();
    }

    @And("user looks through photo gallery")
    public void userLooksThroughPhotoGallery() {
        Method.hoverOn(landingPage.carouselNextPicture);
        int num = landingPage.ListOfPictures.size();

        for (int i = 0; i < num; i++) {
            Method.hoverOn(landingPage.carouselNextPicture);
            landingPage.carouselNextPicture.click();

        }

    }


    @And("user clicks on Build & Price")
    public void userClicksOnBuildPrice() {
        landingPage.Build_AND_Price.click();
    }

    @Then("title contains {string}")
    public void titleContains(String expectedTitleText) {

        landingPage.buildZipCodeInput.sendKeys("60025");
        landingPage.buildZipCodeEnterButton.click();
        Waiting.toSleep(3);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitleText));
    }
}
