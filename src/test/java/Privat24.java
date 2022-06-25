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
        $("[data-qa-node='amount']").sendKeys("500");


        //Dropdown menu
       // $("[name='currency']").selectOptionByValue("USD");


      $("[type='submit']").pressEnter();
        Thread.sleep (10000);



    }
}
