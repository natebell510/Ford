package com.ford.POM;

import com.ford.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LandingPage {
    public LandingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //1
    @FindBy (xpath = "//span[.='SUVS & CROSSOVERS']/span")
    public WebElement SUVS_CROSSOVERS;

    //combine names List
    @FindBy (xpath = "//li[contains(@id,'brand-nav-vm-seg1-')]/div/div[2]/span[2]/a")
    public WebElement modelNameOF_SUVS_CROSSOVERS;
    //years List
    @FindBy (xpath = "//li[contains(@id,'brand-nav-vm-seg1-')]/div/div[2]/span/span")
    public WebElement modelYearOF_SUVS_CROSSOVERS;

    //2
    // list of a tags to extract text
    @FindBy (xpath = " //div[@class='cta-container fgx-brand-container-pad-mbl left-indt-mbl']/div[@class='cta-wrap ']/a[contains(@id,'brand-nav-vm-seg1-lnk')]")
    public WebElement buttonsExpSeeCertExploreList;

    //3

    @FindBy (xpath = "//a[@id='brand-nav-vm-seg1-lnk1']")
    public WebElement ExploreAllVehicles;


    //6


    @FindBy (xpath = "//a[@id='brand-nav-vm-seg1-lnk3']")
    public WebElement CertifiedUsed;

    //7

    @FindBy (xpath = "//h2[.='Search Inventory']")
    public WebElement bottomSearchInventory;

    //3
    @FindBy(xpath = "//span[@aria-label='View Future Vehicle Models Only']")
    public WebElement FutureVehiclesCheckbox;

    @FindBy (xpath = "//div[@class='FV-reset-message']")
    public WebElement pleaseResetFilterText;

    @FindBy (xpath = "//span[@class='check-box load-anchor']/following-sibling::span[.='Gas']")
    public WebElement gasCheckbox;

    //5
    @FindBy (xpath = "//span[.='Electric']")
    public WebElement ElectricCheckbox;


    //5
    @FindBy (xpath = "//strong[@data-ng-bind-template='MUSTANG MACH-E']")
    public WebElement mustangMachE;

    //7

    @FindBy (xpath = "//body/div[8]/div/div[3]/div[2]/div/div/div[1]/a")
    public WebElement Continue;

    //8


    @FindBy (xpath = "//a[@id='brand-nav-vm-seg1-lnk4']")
    public WebElement ExploreFuelChoices;



    @FindBy (xpath = "//span[@class='dropdown-font fgx-brand-global-container-pad-left']")
    public WebElement FuelChoices;

    //list of dropdown text
    @FindBy (xpath = "//ul[@class='dropdown subnav subnav-wrapper open']/li/span/a/span")
    public WebElement dropdownFuelChoices;

    //9


    @FindBy (xpath = "//span[.='CARS']/span")
    public WebElement Cars;


    @FindBy (xpath = "//div[5]/nav/div[2]/div[2]/ul/ul[1]/li/div/ul/li[4]/div/div[1]/ul/li/div/div[2]")
    public WebElement Mustang2022;




    @FindBy (xpath = "//span[@class='dropdown-font fgx-brand-global-container-pad-left']")
    public WebElement Explore2022Mustang;


    @FindBy (xpath = "//li/span/a/span[.='Models & Specs']")
    public WebElement Models_Specs;

    //list of mustang option
    @FindBy (xpath = "//div[@class='sub-component-wrap']/div")
    public WebElement MustangOptions;


    @FindBy (xpath = "//h3/a[@href='/cars/mustang/2022/models/shelby-gt500/']")
    public WebElement MustangShelbyGT500;


    //hover over
    @FindBy (xpath = "//div[@class='carousel-btn carousel-next']")
    public WebElement carouselNextPicture;

    // list of pictures carousel
    @FindBy (xpath = "//div[@class='carousel-inner fgx-global-pad-right-lg']/div")
    public List<WebElement> ListOfPictures;


    @FindBy (xpath = "//*[@id=\"component01\"]/div/div/div/div[1]/div[1]/div/div/div/div/div[2]/a")
    public List<WebElement> Build_AND_Price;












}
