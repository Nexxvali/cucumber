package Testcases;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Test;

import java.util.List;

@RunWith(SerenityRunner.class)


public class Dropdown extends PageObject {
    @Managed
    WebDriver driver;
    @Test
            public void register()
    {
open();
        WebElementFacade dropdown = find(By.id("q3"));
        List<WebElementFacade> values =	dropdown.thenFindAll(By.tagName("option"));
        values.get(3).click();

        System.out.println(values.get(3).getText());

    /*    for(WebElementFacade value:values) {

            System.out.println(value.getAttribute("lang"));

        }*/

    }
}
