import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SignInTest extends Initialization{

    private MainNavBar mainNavBar = new MainNavBar();
    private SignInPage signInPage = new SignInPage();

    @BeforeEach
    public void setup(){
        mainNavBar.navigate();
    }

    @Test
    public void sigInTest(){
        mainNavBar.clickOnSignIn();
        signInPage.clickOnSignInWithIMDB();
        signInPage.fillEmail();
        signInPage.fillPassword();
        signInPage.clickOnSignInButton();
    }
}
