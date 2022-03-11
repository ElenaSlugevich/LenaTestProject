package lenaTest1;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class JDTest {



    @Test
    public void JDTest() {
        Configuration.holdBrowserOpen = true;
        open("https://avm14.lpr.jet.msk.su/");
        element(byName("login")).setValue("jd");
        element(byName("password")).setValue("q1");
        $x("//a[.='Войти']").shouldBe(Condition.enabled).click();
        //        ChromeDriver driver = new ChromeDriver();

//        driver.get("https://avm14.lpr.jet.msk.su/");
    }
}
