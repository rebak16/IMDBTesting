import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainNavBar extends BasePage{

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//div[text()='Sign In']")
    private WebElement signIn;
    @FindBy(id = "suggestion-search")
    private WebElement searchField;
    @FindBy(id = "suggestion-search-button")
    private WebElement searchButton;
    @FindBy(xpath = "//div[text()='All']")
    private WebElement categories;
    @FindBy(id = "home_img_holder")
    private WebElement homeButton;
    @FindBy(xpath = "//*[@class='ipc-icon ipc-icon--menu']")
    private WebElement menuBar;
    @FindBy(xpath = "//*[text()='Watchlist']")
    private WebElement watchlist;
    @FindBy(xpath = "//*[text()='All']")
    private WebElement allButton;
    @FindBy(linkText = "Advanced Search")
    private WebElement advancedSearchButton;

    public MainNavBar() {
        this.driver = getDriver();
        this.wait = getWait();
        PageFactory.initElements(driver, this);
    }

    public void clickOnSignIn(){
            signIn.click();
    }

    public void searchAMovie(){
        searchField.sendKeys("Inglourious Basterds");
        searchField.sendKeys(Keys.ENTER);
    }

    public void clickOnAll(){
        allButton.click();
    }

    public void clickOnAdvancedSearch(){
        wait.until(ExpectedConditions.elementToBeClickable(advancedSearchButton));
        advancedSearchButton.click();
    }

    public void clickOnWatchlist() {
        watchlist.click();
    }
}
