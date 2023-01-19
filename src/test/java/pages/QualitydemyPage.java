package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {

    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(id="login-email")
    public WebElement kullaniciEmailKutusu;

    @FindBy(id="login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;

    @FindBy(linkText = "My courses")
    public WebElement basariliGirisCoursesLinki;

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement cookiesAccept;

    @FindBy(xpath = "//div[@class='instructor-box menu-icon-box ms-md-3']")
    public WebElement instructorLinki;

    @FindBy(xpath = "//span[text()='Course manager']")
    public WebElement courseManagerLinki;

    @FindBy(xpath = "//a[@class='btn btn-outline-primary btn-rounded alignToTitle']")
    public WebElement addNewCourseLinki;

    @FindBy(xpath = "//span[text()='Seo']")
    public WebElement seoLinki;

    @FindBy(xpath = "//input[@size='43']")
    public WebElement metaKeywordsTextbox;

    @FindBy (xpath = "//textarea[@name='meta_description']")
    public WebElement metaDescriptionTextbox;

    @FindBy(xpath = "//span[text()='Categories']")
    public WebElement categoriesDropDown;

    @FindBy(xpath = "//span[text()='English Course']")
    public WebElement enlishCourseSekmesi;

    @FindBy (xpath = "(//a[@class='course-title'])[1]")
    public WebElement englishCourseLearnToSpeakDersiLinki;

    @FindBy (xpath = " //i[@class='fas fa-balance-scale']")
    public WebElement comparebutonu;

    @FindBy (xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement homeCourseCompareYazisi;

    @FindBy(xpath = "//button[text()='Buy now']")
    public WebElement buyNowButonu;

    @FindBy(xpath = "//li[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement homeShoppingCartYazisi;

    @FindBy(xpath ="//span[text()='Web Design Course']" )
    public WebElement webDesignCourseSekmesi;

    @FindBy(xpath = "(//a[@class='course-title'])[2]")
    public WebElement reactAndTypeScriptDersiLinki;





    /*
    public void loginMethodu(){
        cookies.click();
        loginLink.click();
        emailBox.sendKeys(ConfigReader.getProperty("mail"));
        passwordBox.sendKeys(ConfigReader.getProperty("password"));
        loginButton.click();
    }

@FindBy(xpath = "//*[text()='Categories']")
    public WebElement categories;

    @FindBy(xpath = "(//*[text()='All courses'])[1]")
    public WebElement allCourses;

    @FindBy(xpath = "//*[text()='2']")
    public WebElement secondPage;

    @FindBy(xpath = "(//a[@class='course-title'])[5]")
    public WebElement english;

    @FindBy(xpath = "(//div[@class='col-md-12'])[10]")
    public WebElement photo;

    @FindBy(xpath = "//button[@class='btn btn-buy']")
    public WebElement buyButton;

    @FindBy(xpath = "//button[text()='Checkout']")
    public WebElement checkoutButton;

    @FindBy(xpath = "//div[@class='row payment-gateway stripe']")
    public WebElement stripeButton;

    @FindBy(xpath = "//button[text()='Pay with stripe']")
    public WebElement payWithStripeButton;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement payEmailBox;

    @FindBy(xpath = "//div[@class='SubmitButton-IconContainer']")
    private WebElement payButton;

    public void payWithCard(){
        actions.sendKeys(payEmailBox,"anevzatcelik@gmail.com")
                .sendKeys(Keys.TAB).sendKeys("4242424242424242")
                .sendKeys(Keys.TAB).sendKeys("1124")
                .sendKeys(Keys.TAB).sendKeys("325")
                .sendKeys(Keys.TAB).sendKeys("ahmet").click(payButton).perform();
    }

    @FindBy(xpath = "//h5[text()=' Java Kursu']")
    public WebElement javaKursu;
    @FindBy(xpath = "//button[@class='btn btn-add-wishlist ']")
    public WebElement addWishList;
    @FindBy(xpath = "(//div[@class='icon'])[3]")
    public WebElement wishListIcon;
    @FindBy(xpath = "//a[text()='Go to wishlist']")
    public WebElement goToWishListButton;

    @FindBy(xpath = "//button[@onclick='handleWishList(this)']")
    public WebElement wishListCikarma;
    @FindBy(xpath = "//a[@class='btn btn-danger btn-yes']")
    public WebElement yesButton;

     */

}