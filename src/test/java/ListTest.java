import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListTest extends Initialization {

    private MainNavBar mainNavBar = new MainNavBar();
    private SignInPage signInPage = new SignInPage();
    private YourListsPage yourListsPage = new YourListsPage();

    @BeforeEach
    public void setup() {
        mainNavBar.navigate();
        signInPage.loginWithValidData();
    }

    @Test
    public void checkList() {
        mainNavBar.clickOnUserButton();
        mainNavBar.clickOnYourLists();
        yourListsPage.clickOnMegunhatatlan();
        Assertions.assertTrue(yourListsPage.checkMovie());
    }
}
