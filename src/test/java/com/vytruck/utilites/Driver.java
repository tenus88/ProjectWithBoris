package com.vytruck.utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


//Hello
    public class Driver {

        private Driver(){}

        private static WebDriver driver;

        public static WebDriver getDriver(){

            if(driver==null){

                String browser = ConfigurationReader.getProperty("browser");
                switch (browser){
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    case "firefox":
                        WebDriverManager.chromedriver().setup();
                        driver = new FirefoxDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                }
            }
            return driver;
        }

        public static void closeDriver(){ // to use we should call it
            if (driver!=null){
                driver.quit();
                driver=null;
            }
        }

    }



