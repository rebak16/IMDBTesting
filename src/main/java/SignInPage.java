import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends BasePage{

    private WebDriver driver;
    private WebDriverWait wait;
    private MainNavBar mainNavBar = new MainNavBar();
    @FindBy(xpath = "//*[text()='Sign in with IMDb']")
    private WebElement signInWithIMDB;
    @FindBy(id = "ap_email")
    private WebElement emailField;
    @FindBy(id = "ap_password")
    private WebElement passwordField;
    @FindBy(id = "signInSubmit")
    private WebElement signInButton;

    public SignInPage() {
        this.driver = getDriver();
        this.wait = getWait();
        PageFactory.initElements(driver, this);
    }

    public void loginWithValidData(){
        try{
            mainNavBar.clickOnSignIn();
            clickOnSignInWithIMDB();
            fillEmail();
            fillPassword();
            clickOnSignInButton();
        } catch (NoSuchElementException | TimeoutException e){

        }
    }

    public void clickOnSignInWithIMDB(){
        signInWithIMDB.click();
    }

    public void fillEmail(){
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(getUsername());
    }

    public void fillPassword(){
        passwordField.sendKeys(getPassword());
    }

    public void clickOnSignInButton(){
        signInButton.click();
    }
}
