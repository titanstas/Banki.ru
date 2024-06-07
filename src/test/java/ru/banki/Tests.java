package ru.banki;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.banki.BankiMain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Selenide.open;
import static helpers.DataProvider.token;

public class Tests extends BaseTest {


    @Test
    @DisplayName("Проверка вкладки Вклады")
    public void FirstTest()  {

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

    @Test
    public void ThirdTest() throws IOException {
        Path bankiPath = Paths.get("C:\\Users\\STAS\\Desktop\\Banki.txt");
        Files.write(bankiPath, Collections.singleton("erteeee"));


    }

}
