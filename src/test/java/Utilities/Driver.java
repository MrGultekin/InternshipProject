package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static ThreadLocal<WebDriver> threadDriver=new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName=new ThreadLocal<>();

    public static WebDriver getDriver()
    {
        // eğer browser adı gelmezse
        if (threadBrowserName.get()==null)
        {
            threadBrowserName.set("chrome");
        }

        if (threadDriver.get() == null)
        {
            switch (threadBrowserName.get())
            {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set( new FirefoxDriver() );
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set( new ChromeDriver() );
                    break;

            }
        }
        return threadDriver.get();
    }

    public static void quitDriver()
    {
        if (threadDriver.get() != null)
        {
           threadDriver.get().quit(); // ilgili driverdan quit edildi
            WebDriver driver=threadDriver.get(); // threadLocl deki ilgili driverının referansı alındı.
            driver=null;  // null değeri atanarak boşaltıldı.
            threadDriver.set(driver); // ve set edilerek ThreadLocal in içindeki saklanan null hale getirildi.
        }
    }



}