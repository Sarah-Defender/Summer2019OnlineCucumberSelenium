package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesPage extends BasePage {

    @FindBy(css="[title='Create Car']")
    public WebElement CreateACarElement;

    public void clickToCreateACar(){
        BrowserUtils.waitForClickablility(CreateACarElement,10);
        BrowserUtils.waitForClickablility(CreateACarElement,10);

        CreateACarElement.click();
    }


}
