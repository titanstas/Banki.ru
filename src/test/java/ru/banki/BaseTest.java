package ru.banki;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest {

//   public static String token ="eyJhbGciOiJSUzI1NiJ9.eyJyb2xlcyI6WzIsMTc3LDZdLCJ1c2VybmFtZSI6InVzZXItODMxODg0NTQwMjgiLCJpZCI6ODQ1NDAyOCwicmVmcmVzaCI6IjY2MmQ3NTczODk5ZDhhMTAzMTQ4YzY2NmI2YjQzMTlhIiwiZW1haWwiOiJ0aXRhbnN0YXNAeWFuZGV4LnJ1IiwiaWF0IjoxNzE3NjAzMDE0LCJleHAiOjE3MTc2MDQ4MTR9.LAqCM1P0ocEr9AXqXXMnNIXzUs0IlI5Fd8nwPm0WuM72Tfu_SO0e8bHU1HqlNXm4h4BBhrpLJU3UlRnmcF_eW8c8gL-ur69cfqbf5BE7pQDOrAtr3YCO2z3UKCn9570JB2ZR2rhCpBOvz-pg2m7r5nu6vhsEX1VkWMFzezHxMFO1ew05o_ndYEKYB52bTERJciLXfg-rvsBO3XBNAlSRvUSMpHljDc7QuSD9Dtx0STVLifCaoeZSz5E2oSf2rfnRxl6FGpsrZYTziUt5tsxBnql4Zx9Y5AilO-7xzaqwWi_ucQb9Z-H12r-2sF4aAuWJnfU6R5IXR9IfrIYr-fOSXuKKrwhUcSq7PYx8RcEqMUlXtuSRYEsvsro7EELl0MPOkJig4DgLY4flHtqpntSNOOJZp28dbnnYnRYje5ITIAbzJRJ53XgU3W6h6lWjFR1wPyKbVpPE-9lKPbeaIItf_0rDRIDH01QGM4xIDCFM-uMEBYHkz6pe9gDkL_F7LzuOD_l5u8znauJBaJ1ATAAdLlhE5nTEplLFTl-LAyItI-wsUunWZA6vrThLyqwWB8jxt6bhmdl_LvVXKnTiUMqyd16YTjNHnaBFSxMq_st5tSdNEcSiqKkilJ7laly8bFZYNhFkKtY0EsFUPgGKbJG4iJQI6XZRSwUsuIxY2Qq4CKM";
//
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


//
//          ChromeOptions options = new ChromeOptions();
//          options.setBinary("D:\\ChromeDriver\\Chrome\\chrome-win64\\chrome.exe");
//          System.setProperty("webdriver.chrome.driver", System.getenv("CHROME_DRIVER"));
//          System.setProperty("selenide.holdBrowserOpen", "true");


//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);


        /*
        System.setProperty("webdriver.chrome.driver",System.getenv("CHROME_DRIVER"));
        WebDriver driver;
        driver = new ChromeDriver(options);
        setWebDriver(driver);
        */


    }
}
