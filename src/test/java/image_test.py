import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImageTest {

    private MainNavBar mainNavBar = new MainNavBar();
    private SearchPage searchPage = new SearchPage();

    @BeforeEach
    public void setup(){
        mainNavBar.navigate();
    }

    @Test
    public void clickOnImage(){
        mainNavBar.searchAMovie();
        searchPage.clickOnSearchResult();
        searchPage.clickOnImage();
        Assertions.assertTrue(searchPage.checkImageIsDisplayed());
    }
}
