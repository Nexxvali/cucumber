package Testcases;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
@RunWith(SerenityRunner.class)
//super class in serenity

public class GoogleSearch extends PageObject  {

    @Managed(driver="chrome")
    WebDriver driver;

    @FindBy(name="q")
        WebElement googlesearch;
@Test
public void search() throws InterruptedException {

open();
getTitle();
//driver.get("https://www.google.com/");
Thread.sleep(2000);
//getDriver().findElement(By.name("q")).sendKeys("serenity");
//find(By.name("q")).sendKeys("serenity");
//for xpath and css selector
//$("//input[@name='q']").sendKeys("serenity");
//typeInto($("//input[@name='q']"),"Sereneity");
    typeInto(googlesearch,"Sereneity");
    WebElementFacade textbox=find(By.name("q"));
   // textbox.type("serenity");
    textbox.typeAndEnter("Serenity");
}

}
