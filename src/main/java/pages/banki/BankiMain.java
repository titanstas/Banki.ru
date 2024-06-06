package pages.banki;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Selenide.*;

public class BankiMain extends BasePage {
    /**
     * Кнопка 'Вклады'
     */
    public String depositsTab = "//a[contains(@href, '/products/deposits/?source=main_menu_deposits')]";


    /**
     *Метод нажатия на  кнопку 'Вклады'
     * @return Возвращает класс страницы вкладов BankiDeposits.class
     */
    @Step("Нажать на вкладку Вклады")
    public BankiDeposits cklickDeposits(){
        $x(depositsTab).click();
        return page(BankiDeposits.class);
    }
    // https://www.banki.ru/
    /**
     *Метод для добавления cookie
     */
    public BankiMain addCookie (String name, String value)
    {
        WebDriverRunner.getWebDriver().manage().addCookie(new Cookie(name,value));
        return page(BankiMain.class);
    }
}
