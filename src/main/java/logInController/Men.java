package logInController;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Men extends ScriptBase {

    @FindBy(css = "#cat-label-12202 > span")
    WebElement menMouseOver;
    @FindBy(css = "#cat-label-12202 > span")
    WebElement men;


    public void menButton(WebDriver driver) { PageFactory.initElements(driver, this);
        mouseOver(menMouseOver, driver);
        men.click();

    }


}
