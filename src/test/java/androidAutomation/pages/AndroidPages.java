package androidAutomation.pages;

import net.serenitybdd.core.pages.PageObject;
import androidAutomation.ILocators;

import static androidAutomation.MyAndroidDriver.getElementById;

public class AndroidPages extends PageObject {
    public void clickOnTheAppsButton() throws Exception {
        getElementById(ILocators.app).tap(1, 1);
    }
}
