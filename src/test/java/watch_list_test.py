import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WatchlistTest extends Initialization{

    private HomePage homePage = new HomePage();
    private MainNavBar mainNavBar = new MainNavBar();
    private SignInPage signInPage = new SignInPage();
    private SearchResultsPage searchResultsPage = new SearchResultsPage();

    @BeforeEach
    public void setup(){
        mainNavBar.navigate();
        signInPage.loginWithValidData();
    }

    @Test
    public void clickOnAddToWatchlist(){
        mainNavBar.searchAMovie();
        searchResultsPage.clickOnSearchResult();
        homePage.clickOnAddToWatchlist();
        Assertions.assertTrue(homePage.checkWatchlist());
        homePage.clickOnRemoveFromWatchlist();
    }
}
