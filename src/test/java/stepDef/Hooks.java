package stepDef;

import io.cucumber.java.*;
import static helper.Utility.startDriver;
import static helper.Utility.quitDriver;
public class Hooks {

     @BeforeAll
    public static void setUp(){
         System.out.println("Before All");
     }
     @AfterAll
    public static void tearDown(){
         System.out.println("After All");
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
