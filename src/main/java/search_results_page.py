import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage extends BasePage{

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//*[text()='Becstelen brigantyk']")
    private WebElement searchResults;

    public SearchResultsPage() {
        this.driver = getDriver();
        this.wait = getWait();
        PageFactory.initElements(driver, this);
    }

    public void clickOnSearchResult(){
        searchResults.click();
    }

    public boolean getSearchResults() {
        return searchResults.isDisplayed();
    }
}
