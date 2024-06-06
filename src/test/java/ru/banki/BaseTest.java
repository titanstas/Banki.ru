package ru.banki;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {


   @BeforeEach
   public void option(){

//        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\Chrome\\chrome-win64\\chrome.exe");
        /**
         *Время ожидания выбранного условия
         */
        Configuration.timeout = 6000;
        /**
         *Используется браузер хром для тестирования из выбранного место хранения
         */
        Configuration.browserBinary="D:\\ChromeDriver\\Chrome\\chrome-win64\\chrome.exe";
        /**
         *Используется браузер хром
         */
        Configuration.browser = "chrome";
        /**
         *Используется системная переменная для установки драйвера для браузера хром их выбранного места хранения
         */
        System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_DRIVER"));
        /**
         *Не включает headless мод, который используется, чтобы запустить браузер без видимого пользовательского интерфейса
         */
        Configuration.headless=false;


    }
}
