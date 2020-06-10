import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage{

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//*[text()='Advanced Title Search']")
    private WebElement advancedTitleSearch;
    @FindBy(xpath = "//*[@class='star-rating-star no-rating']")
    private WebElement rate;
    @FindBy(xpath = "//div[@id='star-rating-widget']/div/div/span/span/a[10]")
    private WebElement tenRate;
    @FindBy(xpath = "//*[text()='Inglourious Basterds']")
    private WebElement searchResult;
    @FindBy(xpath = "//*[text()='Sign in']")
    private WebElement checkSignInText;

    public SearchPage() {
        this.driver = getDriver();
        this.wait = getWait();
        PageFactory.initElements(driver, this);
    }

    public void clickOnAdvancedTitleSearch(){
        wait.until(ExpectedConditions.elementToBeClickable(advancedTitleSearch));
        advancedTitleSearch.click();
    }

    public void clickOnSearchResult(){
        searchResult.click();
    }

    public void rateAMovie(){
        wait.until(ExpectedConditions.elementToBeClickable(rate));
        rate.click();
    }

    public void select10(){
        tenRate.click();
    }

    public boolean checkSignInText(){
        return checkSignInText.isDisplayed();
    }
}
