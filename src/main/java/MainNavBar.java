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
    @FindBy(xpath = "//*[@class='ipc-button ipc-button--single-padding ipc-button--default-height ipc-button--core-baseAlt ipc-button--theme-baseAlt ipc-button--on-textPrimary ipc-text-button']")
    private WebElement watchlist;
    @FindBy(xpath = "//*[text()='All']")
    private WebElement allButton;
    @FindBy(linkText = "Advanced Search")
    private WebElement advancedSearchButton;
    @FindBy(xpath = "//*[@class='imdb-header__account-toggle--logged-in imdb-header__accountmenu-toggle navbar__user-name navbar__user-menu-toggle__name navbar__user-menu-toggle--desktop']")
    private WebElement userButton;
    @FindBy(linkText = "Your lists")
    private WebElement yourLists;

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
        wait.until(ExpectedConditions.elementToBeClickable(allButton));
        allButton.click();
    }

    public void clickOnAdvancedSearch(){
        wait.until(ExpectedConditions.elementToBeClickable(advancedSearchButton));
        advancedSearchButton.click();
    }

    public void clickOnWatchlist() {
        watchlist.click();
    }

    public void clickOnUserButton(){
        userButton.click();
    }

    public void clickOnYourLists(){
        wait.until(ExpectedConditions.elementToBeClickable(yourLists));
        yourLists.click();
    }
}
