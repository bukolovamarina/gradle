
    package com.it;

import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;

    public class TestMy {
        @BeforeClass
        public void setUpClass() throws Exception {
            System.out.println("BeforeClass");

        }
    }
        @AfterClass

        public static void tesrDownClass() throws InterruptedException {
            System.out.println("AfterClass");
        }
            /*System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://mvnrepository.com");
            Thread.sleep (2000);
            Assert.assertEquals("https://mvnrepository.com/", driver.getCurrentUrl());
            driver.quit();
        }

    }*/
    @Test
    public void test2() {
        System.out.println("test2");
    }

        @AfterClass
        public static void tearDown() throws Exception {
            System.out.println("AfterClass");
        }

