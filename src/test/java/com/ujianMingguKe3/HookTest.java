package com.ujianMingguKe3;

import com.ujianMingguKe3.drivers.DriverSingleton;
import com.ujianMingguKe3.drivers.utils.BrowserType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class HookTest {

    @BeforeTest
    public void init() {
        System.out.println("init");
        DriverSingleton.getDriver(BrowserType.CHROME);
    }

    @AfterTest
    public void teardown() {
        System.out.println("teardown");
        delay(10);
        DriverSingleton.quitDriver();
    }

    public static void delay(long second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
