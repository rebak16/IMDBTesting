import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvancedTitleSearchPage extends BasePage{

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//*[text()='Feature Film']")
    private WebElement featureFilm;
    @FindBy(xpath = "//*[text()='TV Movie']")
    private WebElement TVMovie;
    @FindBy(xpath = "//*[@name='release_date-min']")
    private WebElement releaseDateMin;
    @FindBy(xpath = "//*[@name='release_date-max']")
    private WebElement releaseDateMax;
    @FindBy(xpath = "//*[@name='user_rating-min']")
    private WebElement userRatingMin;
    @FindBy(xpath = "//*[@name='user_rating-max']")
    private WebElement userRatingMax;
    @FindBy(xpath = "//*[@name='num_votes-min']")
    private WebElement votingNumberMin;
    @FindBy(xpath = "//*[@name='num_votes-max']")
    private WebElement votingNumberMax;
    @FindBy(xpath = "//*[@name='countries']")
    private WebElement selectCountries;
    @FindBy(xpath = "//*[@id='my_ratings|exclude']")
    private WebElement excludeMyRatings;
    @FindBy(xpath = "//*[@name='!lists']")
    private WebElement excludeYourWatchlistAndMegunhatatlan;
    @FindBy(xpath = "//*[@id='search-count']")
    private WebElement searchCount;
    @FindBy(xpath = "//*[@name='sort']")
    private WebElement sort;
    @FindBy(xpath = "//*[text()='Search']")
    private WebElement searchButton;



    public AdvancedTitleSearchPage() {
        this.driver = getDriver();
        this.wait = getWait();
        PageFactory.initElements(driver, this);
    }

    public void selectFilmAndMovie(){
        wait.until(ExpectedConditions.elementToBeClickable(featureFilm));
        featureFilm.click();
        TVMovie.click();
    }

    public void fillReleaseDateMinAndMax(String releaseDateMinPar, String releaseDateMaxPar){
        releaseDateMin.sendKeys(releaseDateMinPar);
        releaseDateMax.sendKeys(releaseDateMaxPar);
    }

    public Select selectMinRating(){
        wait.until(ExpectedConditions.elementToBeClickable(userRatingMin));
        return new Select(userRatingMin);
    }

    public Select selectMaxRating(){
        wait.until(ExpectedConditions.elementToBeClickable(userRatingMax));
        return new Select(userRatingMax);
    }

    public void setUserRatingMinOption(String minRatingPar){
        selectMinRating().selectByVisibleText(minRatingPar);
    }

    public void setUserRatingMaxOption(String maxRatingPar){
        selectMaxRating().selectByVisibleText(maxRatingPar);
    }

    public void fillVotes(String votingNumberMinPar, String votingNumberMaxPar){
        wait.until(ExpectedConditions.elementToBeClickable(votingNumberMin));
        votingNumberMin.sendKeys(votingNumberMinPar);
        votingNumberMax.sendKeys(votingNumberMaxPar);
    }

    public Select selectCountries(){
        return new Select(selectCountries);
    }

    public void setSelectCountries(){
        selectCountries().selectByVisibleText("United States");
    }

    public void deselectMyRatingsMovies(){
        excludeMyRatings.click();
    }

    public Select selectYourWatchlist(){
        return new Select(excludeYourWatchlistAndMegunhatatlan);
    }

    public void setSelectYourWatchlistAndMegunhatatlan(){
        selectYourWatchlist().selectByVisibleText("Your Watchlist");
        selectYourWatchlist().selectByVisibleText("Megunhatatlan");
    }

    public Select selectTitlesPerPage(){
        return new Select(searchCount);
    }

    public void setTitlePerPage(){
        selectTitlesPerPage().selectByVisibleText("250 per page");
    }

    public Select selectSort(){
        return new Select(sort);
    }

    public void setSorting(){
        selectSort().selectByVisibleText(" Release Date Ascending");
    }

    public void clickOnSearch(){
        searchButton.click();
    }

}
