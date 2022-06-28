import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.$;

public class Privat24 {

    @Test

    public void privat24Paid () throws InterruptedException {

      //  System.out.println("Hello Earth");
        WebDriverManager.chromedriver().setup();
        Selenide.open("https://next.privat24.ua/money-transfer/card");
        // card sender
        $("[data-qa-node='numberdebitSource']").sendKeys("4552331448138217");
        $("[data-qa-node='expiredebitSource']").sendKeys("0524");
        $("[data-qa-node='cvvdebitSource']").sendKeys("926");
        $("[data-qa-node='firstNamedebitSource']").sendKeys("Vasil");
        $("[data-qa-node='lastNamedebitSource']").sendKeys("Petrenko");

        //card receiver
        $("[data-qa-node='numberreceiver']").sendKeys("4004159115449003");
        $("[data-qa-node='firstNamereceiver']").sendKeys("Vasil");
        $("[data-qa-node='lastNamereceiver']").sendKeys("Petrenko");

        //input sum
        $("[data-qa-node='amount']").sendKeys("123");
        $("[data-qa-node='currency']").click();
        $("[data-qa-value='USD']").click();

        //check input sender
        $("[data-qa-node='numberdebitSource']").shouldHave(Condition.value("4552 3314 4813 8217"));
        $("[data-qa-node='expiredebitSource']").shouldHave(Condition.value("05 / 24"));
        $("[data-qa-node='cvvdebitSource']").shouldHave(Condition.value("926"));
        $("[data-qa-node='firstNamedebitSource']").shouldHave(Condition.value("Vasil"));
        $("[data-qa-node='lastNamedebitSource']").shouldHave(Condition.value("Petrenko"));

        //check input receiver
        $("[data-qa-node='numberreceiver']").shouldHave(Condition.value("4004 1591 1544 9003"));
        $("[data-qa-node='firstNamereceiver']").shouldHave(Condition.value("Vasil"));
        $("[data-qa-node='lastNamereceiver']").shouldHave(Condition.value("Petrenko"));

        //check input sum
        $("[data-qa-node='amount']").shouldHave(Condition.value("123"));
        $("[data-qa-node ='currency']").shouldHave(Condition.text("USD"));

        $("[type='submit']").pressEnter();
        Thread.sleep (10000);


    }
}
