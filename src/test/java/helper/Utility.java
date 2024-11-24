package helper;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;
import java.util.Random;

public class Utility {

    public static WebDriver driver;

    public static File getJSONSchemaFile(String JSONFile){
        return new File("src/test/java/helper/JSONSchemaData/" + JSONFile);
    }

    public static String generateRandomEmail(){
        String[] domains = {"gmail.com", "yahoo.com"};
        String allowedChar = "abcdefghijklmnopqrstuvwxyz" + "1234567890";
        String email = "";

        Random random = new Random();
        String domain = domains[random.nextInt(domains.length)];

        String temp  = RandomStringUtils.randomAlphanumeric(10);
        email = temp + "@" + domain;
        return email;
    }

    public static String generateUsername(){
        String allowedChar = "abcdefghijklmnopqrstuvwxyz" + "1234567890";
        String username    = "";
        String temp        = RandomStringUtils.randomAlphanumeric(5);
        username = "rizky" + temp;
        return username;
    }
    public static String generatePassword(){
        String allowedChar = "abcdefghijklmnopqrstuvwxyz" + "1234567890";
        String password    = "";
        String temp        = RandomStringUtils.randomAlphanumeric(10);
        password = temp;
        return password;
    }

    public static String generateName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }
    public static String generateCountry(){
        Faker faker = new Faker();
        return faker.country().name();
    }

    public static String generateCity(){
        Faker faker = new Faker();
        return faker.address().city();
    }
    public static String generateCard(){
        Faker faker = new Faker();
        return faker.finance().creditCard();
    }
    public static String generateMonth(){
        Random random   = new Random();
        int monthNumber = random.nextInt(12) + 1;
        String month    = String.format("%02d", monthNumber);
        return month;
    }

    public static String generateYear(){
        Random random   = new Random();
        int yearNumber = random.nextInt(12) + 2;
        String year    = String.format("%02d", yearNumber);
        return year;
    }

    public static String generateMessage(){
        Faker faker = new Faker();
        return faker.shakespeare().hamletQuote();
    }

    public static void startDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    public static void quitDriver(){
        driver.quit();
    }

}
