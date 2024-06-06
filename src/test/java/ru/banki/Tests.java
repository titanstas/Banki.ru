package ru.banki;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.banki.BankiMain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Selenide.open;
import static helpers.DataProvider.token;

public class Tests extends BaseTest {


    @Test
    @DisplayName("Проверка вкладки Вклады")
    public void FirstTest() throws InterruptedException {

        open("https://www.banki.ru/", BankiMain.class)
                .addCookie("BANKI_RU_LOGIN","user-83188454028")
                .addCookie("BANKI_PASSPORT_TOKEN", token)
                .cklickDeposits()
                .clickDepositsFilter()
                .clickCheckBoxNoAdditionalExpenses()
                .clickCheckBoxHideGrowingRates()
                .clickModalOK()
                .clickSortingList()
                .clickDepositRate()
                .showMoreDeposits()
                .getDeposits();

//                   double i=0.00;



    }

    @Test
    public void SecondTest() {
        String s =" Cтавка \n 17,30%";
        Pattern pattern = Pattern.compile("\\d{1,2}[,]\\d{2}");
        Matcher matcher = pattern.matcher(s);
        matcher.find();
        System.out.println(matcher.group().replaceAll(",", "."));






    }

}
