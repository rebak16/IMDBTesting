import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.FindBy;

public class PlayATrailerTest {

    private MainNavBar mainNavBar = new MainNavBar();
    private SearchPage searchPage = new SearchPage();

    @BeforeEach
    public void setup(){
        mainNavBar.navigate();
    }

    @Test
    public void playATrailer(){
        mainNavBar.searchAMovie();
        searchPage.clickOnSearchResult();
        searchPage.playTrailer();
        Assertions.assertTrue(searchPage.checkTrailerText());
    }
}
