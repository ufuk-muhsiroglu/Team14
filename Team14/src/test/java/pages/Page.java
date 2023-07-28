package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Page {
    public Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
//son degisiklik




    //Beyza Çolak 14-54 satır arası








































    // Fatma Banu Güler 55-99 arası












































// Mustafa Çelik 100-145 arası













































    // Gönül Obuz 146-191 arası













































    // Ali İsaoğlu 192-237 arası










































    // Ahmet Bedir 238-283 arası
    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement homePageSignIn;
    @FindBy(xpath = "(//input)[1]")
    public WebElement signUsername;
    @FindBy(xpath = "(//input)[2]")
    public WebElement signPassword;
    @FindBy(xpath = "(//button)[1]")
    public WebElement signInButton;
    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement signOutButton;
    @FindBy(xpath = "(//ul)[3]")
    public WebElement dashboard;

    @FindBy(xpath = "(//*[@class='submit-status'])[1]")
    public WebElement invalidMailError;

    @FindBy(xpath = "(//ul/li)[9]")
    public WebElement addressesButton;
    @FindBy(xpath = "(//div/a)[13]")
    public WebElement billingAdd;
    @FindBy(xpath = "//*[@id='billing_first_name']")
    public WebElement billingName;
    @FindBy(xpath = "//*[@id='billing_country']")
    public WebElement billingCountry;
    @FindBy (xpath = "(//*[@type='text'])[4]")
    public WebElement billingStreet;
    @FindBy(xpath = "(//*[@type='text'])[6]")
    public WebElement billingZIP;
    @FindBy(xpath = "//*[@id='billing_city']")
    public WebElement billingTown;
    @FindBy(xpath = "//*[@type='tel']")
    public WebElement billingPhone;
    @FindBy(xpath = "(//*[@class='input-text '])[9]")
    public WebElement billingEmail;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/form/div/p/button")
    public WebElement saveBillingAddress;









    // Bergüzar Zeynep Ölmez 284-329 arası

//guncel yazi











































    //Rümeysa Olgun 330-375 arası













































    // Yasemin Eric 376-421 arası













































    // Ufuk Muhsiroğlu 422-467 arası


















































































}
