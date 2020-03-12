package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {


        public static void main(String[] args) {

            TestChrome();
            TestFirefox();
            TestSafari();

        }

        public static void TestChrome()  {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get("https://google.com");
            String title1 = driver.getTitle();
            driver.get("https://etsy.com");
            String title2 = driver.getTitle();
            driver.navigate().back();
            StringUtility.verifyEquals(title1,driver.getTitle());
            driver.navigate().forward();
            StringUtility.verifyEquals(title2,driver.getTitle());

            driver.quit();


        }
        public static void TestFirefox(){
            WebDriver driver = BrowserFactory.getDriver("Firefox");
            driver.get("https://google.com");
            String title1 = driver.getTitle();
            driver.get("https://etsy.com");
            String title2 = driver.getTitle();
            driver.navigate().back();
            StringUtility.verifyEquals(title1,driver.getTitle());
            driver.navigate().forward();
            StringUtility.verifyEquals(title2,driver.getTitle());

            driver.quit();

        }

        public static void TestSafari() {

            WebDriver driver = BrowserFactory.getDriver("safari");
            driver.get("https://google.com");
            String title1 = driver.getTitle();
            driver.get("https://etsy.com");
            String title2 = driver.getTitle();
            driver.navigate().back();
            StringUtility.verifyEquals(title1,driver.getTitle());
            driver.navigate().forward();
            StringUtility.verifyEquals(title2,driver.getTitle());

            driver.quit();

        }


    }


