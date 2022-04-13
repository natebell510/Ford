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
    public List<WebElement> modelNameOF_SUVS_CROSSOVERS;
    //years List
    @FindBy (xpath = "//li[contains(@id,'brand-nav-vm-seg1-')]/div/div[2]/span/span")
    public WebElement modelYearOF_SUVS_CROSSOVERS;

    //2
    // list of a tags to extract text
    @FindBy (xpath = " //div[@class='cta-container fgx-brand-container-pad-mbl left-indt-mbl']/div[@class='cta-wrap ']/a[contains(@id,'brand-nav-vm-seg1-lnk')]")
    public List<WebElement> buttonsExpSeeCertExploreList;

    //3

    @FindBy (xpath = "//a[@id='brand-nav-vm-seg1-lnk1']")
    public WebElement ExploreAllVehicles;

    @FindBy (xpath= "//button[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button onetrust-lg ot-close-icon']")
    public WebElement closeCookiePopUp;

    //6


    @FindBy (xpath = "//a[@id='brand-nav-vm-seg1-lnk3']")
    public WebElement CertifiedUsed;

    //7

    //h2[.='Search Inventory']
    @FindBy (xpath = "//li[@class='kba-item col-xs-12 col-sm-4'][2]")
    public WebElement bottomSearchInventory;


    @FindBy (xpath = "//h2[.='Search Inventory']")
    public WebElement SearchInventory;

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
    @FindBy (xpath = "//div[@aria-label='click to view all models for 2022 , Mustang Mach-E']")
    public WebElement mustangMachEImage;

    //7
    @FindBy(xpath = "//p[contains(text(),'To help')]")
    public WebElement beforeContinueMessage;


    @FindBy (xpath = "//body/div[8]/div/div[3]/div[2]/div/div/div[1]/a")
    public WebElement Continue;

    //8


    @FindBy (xpath = "//a[@id='brand-nav-vm-seg1-lnk4']")
    public WebElement ExploreFuelChoices;



    @FindBy (xpath = "//span[@class='dropdown-font fgx-brand-global-container-pad-left']")
    public WebElement FuelChoices;

    //list of dropdown text
    @FindBy (xpath = "//ul[@class='dropdown subnav subnav-wrapper open']/li/span/a/span")
    public List<WebElement> dropdownFuelChoices;

    //9


    @FindBy (xpath = "//span[.='CARS']/span")
    public WebElement Cars;


    @FindBy (xpath = "//div[5]/nav/div[2]/div[2]/ul/ul[1]/li/div/ul/li[4]/div/div[1]/ul/li/div/div[2]")
    public WebElement Mustang2022;



    @FindBy (xpath = "//*[@id=\"brand-nav-vm-seg4-mustang-item\"]/div/div[1]/div/div[2]/a/picture/img")
    public WebElement xMustang2022;


    @FindBy (xpath = "//span[@class='dropdown-font fgx-brand-global-container-pad-left']")
    public WebElement Explore2022Mustang;


    @FindBy (xpath = "//li/span/a/span[.='Models & Specs']")
    public WebElement Models_Specs;

    //list of mustang option
    @FindBy (xpath = "//div[@class='sub-component-wrap']/div")
    public List <WebElement> MustangOptions;


    @FindBy (xpath = "//h3/a[@href='/cars/mustang/2022/models/shelby-gt500/']")
    public WebElement MustangShelbyGT500;


    //hover over
    @FindBy (xpath = "//div[@class='carousel-btn carousel-next']")
    public WebElement carouselNextPicture;

    // list of pictures carousel
    @FindBy (xpath = "//div[@class='carousel-inner fgx-global-pad-right-lg']/div")
    public List<WebElement> ListOfPictures;


    @FindBy (xpath = "//*[@id=\"component01\"]/div/div/div/div[1]/div[1]/div/div/div/div/div[2]/a")
    public WebElement Build_AND_Price;



    @FindBy (xpath = "//input[@class='postal-input form-control text-center']")
    public WebElement buildZipCodeInput;

    @FindBy (xpath = "//button[@class='btn btn-enter btn-primary btn-lg']")
    public WebElement buildZipCodeEnterButton;












}
