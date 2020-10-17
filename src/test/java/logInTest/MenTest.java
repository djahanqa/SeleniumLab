package logInTest;

import base.ScriptBase;
import logInController.Men;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MenTest extends ScriptBase {
    Men men;

    @BeforeTest
    public void beforetest() {
        init();

    }
    @Test
    public void veryfyMenButton(){
        men = new Men();
        men.menButton(driver);
    }
}