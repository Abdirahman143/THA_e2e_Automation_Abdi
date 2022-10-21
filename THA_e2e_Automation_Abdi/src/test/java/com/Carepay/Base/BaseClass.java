package com.Carepay.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    public static Properties prop;

    public static  void openBrowser(){
        try{
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src/main/java/com/Carepay/StaticFiles/Config.properties");
            prop.load(fis);
            System.out.println("Testing");

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();

        }
    }

    public static void SetUp()  {

        System.out.println("After the driver");

        if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
            System.out.println("chrome driver");
        }
        else if(prop.getProperty("browser").equalsIgnoreCase("FF")){
            System.setProperty("webdriver.gecko.driver","src/Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        else if(prop.getProperty("browser").equalsIgnoreCase("EE")){
            System.setProperty("webdriver.edge.driver","src/Drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }


        System.out.println("Before url");
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        System.out.println("After url ");
        // driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }



    public void CloseBrowser(){

        driver.close();
    }

}
