import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RateTest extends Initialization {

    private MainNavBar mainNavBar = new MainNavBar();
    private SignInPage signInPage = new SignInPage();
    private SearchPage searchPage = new SearchPage();

    @BeforeEach
    public void setup(){
        mainNavBar.navigate();
    }

    @Test
    public void rateAMovie(){
        mainNavBar.searchAMovie();
        searchPage.clickOnSearchResult();
        searchPage.rateAMovie();
        searchPage.select10();
        Assertions.assertTrue(searchPage.checkSignInText());
    }

}
