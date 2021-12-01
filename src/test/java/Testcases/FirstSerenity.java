package Testcases;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import net.thucydides.core.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
@RunWith(SerenityRunner.class)
public class FirstSerenity extends PageObject {
    @Managed
    WebDriver driver;

    @FindBy(name="q")
    WebElement googlesearch;
    @Test
    public void demo()  {
/*open the chrome browser
             enter the compatibleWithUrl
        search */
        open();
        System.out.println(getTitle());
      // getDriver().findElement(By.name("q")).sendKeys("serenity");
       //find(By.name("q")).sendKeys("serenity");

       //xpath or css
     //   $("//input[@name='q']").sendKeys("serenity");
        typeInto(googlesearch,"Sereneity");
    }
}
