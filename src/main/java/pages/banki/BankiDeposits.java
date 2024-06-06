package pages.banki;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import helpers.BankData;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.*;

public class BankiDeposits extends BasePage {


    /**
     * Кнопка 'Фильтр'
     */
    public String depositsFilterPath = "//button[contains(@data-test,'deposit-filter--more-options_page')]";
    /**
     * Чекбокс 'Без дополнительных трат'
     */
    public String checkBoxNoAdditionalExpensesPath ="//input[contains(@name,'is_no_additional_expenses')]/parent::label/span/span";
    /**
     * Чекбокс 'Без плавающих ставок'
     */
    public String checkBoxHideGrowingRatesPath ="//input[contains(@name,'hide_growing_rates')]/parent::label/span/span";

    /**
     * Кнопка 'Показать' в модальном окне 'Все параметры'
     */
    public String modalPath = "//button[@data-test='deposit-filter--show-results-button_popup']";
    /**
     * Во всплывающем списке сортировки вкладов опция сортировке 'По ставке'
     */
    public String depositRatePath = "//div[contains(@class, 'DropdownList')]//*[contains(text(),'По ставке')]";

    /**
     * Всплывающем список сортировки вкладов
     */
    public String sortingByPath = "//span[contains(@class, 'Link__sc-pw0az9-0 NsKUA')]";

    /**
     * Блоки вкладов из списка найденных вкладов
     */
    public String depositsListPath = "//div[contains(@class, 'FlexboxGrid__sc-akw86o-0 koBwdV')]";
    /**
     * Кнопка 'Показать еще' чтобы отобразилось больше вкладов
     */
    public String showMoreDepositsPath= "//a[contains(@href, 'https://www.banki.ru/products/deposits/?source=main_menu_deposits')]";
    /**
     * Ставка по вкладу в блоке вклада
     */
    public String depositsListRatePath =  "//div[contains(@data-test, 'deposit-card--stat-rate')]";
    /**
     * Название банка в блоке вклада
     */
    public String depositsListNamePath= "//div[contains(@class, 'Text__sc-j452t5-0 dhMeNp')]";
    /**
     * Срок вклада в блоке вклада
     */
    public String depositsListPeriodPath= "//div[contains(@data-test, 'deposit-card--stat-period')]";



    //*[contains(@class,'Checkbox__sc-9ttf87-1 izuEzh')][1]/span/span
    //input[contains(@name,'is_no_additional_expenses')]/parent::label
    //input[contains(@name,'is_no_additional_expenses')]/parent::label/span/span
    /**
     * Метож для нажатия на фильтр вкладов
     * @return Возвращает класс страницы вкладов BankiDeposits.class
     */
    @Step("Нажать на фильтр вкладов")
    public BankiDeposits clickDepositsFilter(){
        $x(depositsFilterPath).click();
        return page(BankiDeposits.class);
    }
    /**
     * Метож для нажатия на кнопку 'Показать еще' чтобы отобразилось больше вкладо
     * @return Возвращает класс страницы вкладов BankiDeposits.class
     */
    @Step("Нажать Показать еще")
    public BankiDeposits showMoreDeposits() throws InterruptedException {

        while ($x(showMoreDepositsPath).is(Condition.visible))
        {
            SelenideElement showMore = $x(showMoreDepositsPath);
            showMore.click();

        }
//        Thread.sleep(3000);


        return page(BankiDeposits.class);
    }
    /**
     * Метож для нажатия на  чекбокс 'Без дополнительных трат' в модальном окне 'Все параметры'
     * @return Возвращает класс страницы вкладов BankiDeposits.class
     */
    @Step("Нажать на чекбокс Без дополнительных трат")
    public BankiDeposits clickCheckBoxNoAdditionalExpenses(){
        SelenideElement checkBoxNoAdditionalExpenses = $x(checkBoxNoAdditionalExpensesPath);
        checkBoxNoAdditionalExpenses.click();
        return page(BankiDeposits.class);

    }
    /**
     * Метож для нажатия на  чекбокс 'Без плавающих ставок' в модальном окне 'Все параметры'
     * @return Возвращает класс страницы вкладов BankiDeposits.class
     */
    @Step("Нажать на чекбокс Без плавающих ставок")
    public BankiDeposits clickCheckBoxHideGrowingRates(){
        SelenideElement checkBoxNoAdditionalExpenses = $x(checkBoxHideGrowingRatesPath);
        checkBoxNoAdditionalExpenses.click();
        return page(BankiDeposits.class);

    }
    /**
     *Метод нажатия на кнопку 'Показать' в модальном окне 'Все параметры'
     * @return Возвращает класс страницы вкладов BankiDeposits.class
     */
    @Step("Модалка ОК")
    public BankiDeposits clickModalOK(){
        SelenideElement modalOk = $x(modalPath);
        modalOk.click();
        return page(BankiDeposits.class);

    }
    /**
     *Метод нажатия на всплывающий список сортировки вкладов
     * @return Возвращает класс страницы вкладов BankiDeposits.class
     */
    @Step("Нажать на список сортировки")
    public BankiDeposits clickSortingList(){
        SelenideElement sortingList = $x(sortingByPath);
        sortingList.click();
        return page(BankiDeposits.class);

    }
    /**
     *Метод выбора опции 'По ставке' в всплывающем списке сортировки вкладов
     * @return Возвращает класс страницы вкладов BankiDeposits.class
     */
    @Step("Сортировка по ставке по вкладу")
    public BankiDeposits clickDepositRate(){
        SelenideElement depositRate = $x(depositRatePath);
        depositRate.click();
        return page(BankiDeposits.class);

    }


    /**
     *Метод получения списка вкладов по блокам и фомрирования данных по банку включающих названия банка, ставку вклада, срок вклада, ставку вклада в формате Double
     * Есть проверка, что получены все найденные блоки вкладов
     * Есть сортировка по ставке, которая убирает результаты, которые меньше найденной максимальной ставки более, чем на 2 пункта
     * @exception InterruptedException
     * @return Возвращает весь текст, который есть в блоке найденного вклада
     *
     */
    @Step("Собрать вклады")
    public List<String> getDeposits() throws InterruptedException {
        Thread.sleep(1000);
        ElementsCollection deposits = $$x(depositsListPath);
        int depositsMatchSize1 = deposits.size();
        System.out.println("Количество депозитов до обработки= " +depositsMatchSize1);
        List<BankData> banksData= new ArrayList<>();
        List<String> depositsText= deposits.stream().map(x->(x.getText())).collect(Collectors.toList());
        for (int i = 1; i < depositsText.size()+1; i++) {

//            SelenideElement element = deposits.get(i).find(By.xpath(depositsListRatePath));
            SelenideElement elementDepositRate = $x(depositsListPath+String.format("[%s]"+depositsListRatePath,i));
            SelenideElement elementDepositBank = $x(depositsListPath+String.format("[%s]"+depositsListNamePath,i));
            SelenideElement elementDepositPeriod = $x(depositsListPath+String.format("[%s]"+depositsListPeriodPath,i));


//            System.out.println("------------------------------------");


            Pattern pattern = Pattern.compile("\\d{1,2}[,]\\d{2}");
            Matcher matcherDepositRate = pattern.matcher(elementDepositRate.getText());
            matcherDepositRate.find();
//            while (matcherDepositRate.find()) {
//                System.out.println(matcherDepositRate.group().replaceAll(",", "."));
//            }

            banksData.add(
                    new BankData
                            (
                    elementDepositBank.getText(),
                    elementDepositRate.getText(),
                    elementDepositPeriod.getText().replaceAll("Срок", "").replaceAll("\n", ""),
                    Double.parseDouble(matcherDepositRate.group().replaceAll(",", "."))
                            )
            );



        }

        Double maxDoubleBankRate=  banksData.stream().mapToDouble(x->x.bankDepositRateDouble).max().getAsDouble();
        List<BankData> sortedBanksData= banksData.stream().filter(x->x.bankDepositRateDouble>=maxDoubleBankRate-2).collect(Collectors.toList());

        int depositsMatchSize2 = deposits.size();
        System.out.println("Количество депозитов после обработки= " +depositsMatchSize2);
        Assertions.assertTrue(depositsMatchSize1==depositsMatchSize2, "Не отображены все найденные вклады");

        System.out.println("Количество отсортированных депозитов "+ sortedBanksData.size());
//        banksData.stream().forEach(x-> System.out.println(x.toString()));
        sortedBanksData.stream().forEach(x-> System.out.println(x.toString()));

        return depositsText;

    }


    //div[contains(@class, 'DropdownList')]//*[contains(text(),'По ставке')]
}
// "\\^\\[а-яА-Я]\\+\\[\\S\\]"


//            Pattern pattern = Pattern.compile("^[а-яА-Я]+[\\S]");
//            Matcher matcher = pattern.matcher(depositsText.get(i));
//            while (matcher.find()) {
//                System.out.println(matcher.group());
//            }