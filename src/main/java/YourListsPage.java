import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourListsPage extends BasePage {

    private WebDriverWait wait;
    private WebDriver driver;
    @FindBy(xpath = "//*[text()='Megunhatatlan']")
    private WebElement megunhatatlan;
    @FindBy(xpath = "//*[text()='Inglourious Basterds']")
    private WebElement checkMovie;

    public YourListsPage() {
        this.driver = getDriver();
        this.wait = getWait();
        PageFactory.initElements(driver, this);
    }

    public void clickOnMegunhatatlan(){
        wait.until(ExpectedConditions.elementToBeClickable(megunhatatlan));
        megunhatatlan.click();
    }

    public boolean checkMovie() {
        wait.until(ExpectedConditions.elementToBeClickable(checkMovie));
        return checkMovie.isDisplayed();
    }
}
