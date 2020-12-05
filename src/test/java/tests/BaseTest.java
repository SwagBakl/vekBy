package tests;

import Content.framework.StartDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    StartDriver startDriver;

    @BeforeTest
    public void setup() {
        startDriver = StartDriver.getInstance();
    }

    @AfterTest
    public void tearDown() {
        startDriver.quit();
    }
}
