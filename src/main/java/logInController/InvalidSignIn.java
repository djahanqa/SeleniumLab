package logInController;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidSignIn extends ScriptBase {
    @FindBy (className = "['class='rs-nav-icon--account']")
    WebElement mouseOverSignin;
    @FindBy (className = "[class='button ds-override secondary-button login-trigger']")
    WebElement signInClick;

    public InvalidSignIn(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void invalidSignInn(WebDriver driver){
        mouseOver(mouseOverSignin,driver);
        signInClick.click();



    }



}
