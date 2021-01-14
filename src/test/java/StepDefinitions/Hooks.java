package StepDefinitions;

import Utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {

    @Before
    public void before(Scenario scenario){
        System.out.println("Senaryo Basladi");
        System.out.println(" senaryonun Id si "+scenario.getId());
        System.out.println(" senaryonun adi "+scenario.getName());
    }
    @After
    public void after(Scenario scenario) {
        System.out.println("Senaryo bitti");
        System.out.println("senaryonun sonucu : "+scenario.getStatus());
       if (scenario.getStatus()=="failed")
       {
           String scenarioName= scenario.getName();
           Date now=new Date();
           SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH mm ss");
           String strDate= formatter.format(now);
           strDate=strDate.replace(":"," ");

           TakesScreenshot ts=(TakesScreenshot) Driver.getDriver();
           File ekrandosyasi=ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(ekrandosyasi, new File("target/FailedScreenShots/"+Driver.threadBrowserName.get()+scenarioName+strDate+".png"));
        }catch(IOException e){
            e.printStackTrace();
        }
       }
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        Driver.quitDriver();
    }

}
