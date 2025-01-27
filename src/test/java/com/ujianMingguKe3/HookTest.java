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
    public void teardown() throws InterruptedException {
        System.out.println("teardown");
        Thread.sleep(5000);
        DriverSingleton.quitDriver();
    }
}
