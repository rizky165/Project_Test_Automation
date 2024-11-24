package stepDef;

import io.cucumber.java.*;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;

import static helper.Utility.quitDriver;
import static helper.Utility.startDriver;


public class Hooks {

    @BeforeAll
    public static void beforeall(){
        System.out.println("Execute before");
    }

    @AfterAll
    public static void afterall(){
        System.out.println("Execute After");
    }

    @Before
    public void beforeTest(){
        startDriver();
    }
    @After
    public void afterTest() throws InterruptedException{
        Thread.sleep(3000 );
        quitDriver();
    }
}