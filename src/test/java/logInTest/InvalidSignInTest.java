package logInTest;

import base.ScriptBase;
import logInController.InvalidSignIn;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvalidSignInTest extends ScriptBase {
    InvalidSignIn invalidSignIn;

    @BeforeTest
    public void beforetest() {
        init();

    }

    @Test
    public void invalidSignIn(){
     invalidSignIn = new InvalidSignIn(driver);
     invalidSignIn.invalidSignInn(driver);
    }

}
