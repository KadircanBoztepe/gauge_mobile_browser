package driver;

import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

//Test browser bazlı çalıştığı için desktop ve mobile farketmeksizin seçilen driver ve cihaz ile aynı proje üzerinden çalıştırılabiliyor.
// Fakat mobil browserda bazı elementler desktoptan farklı olduğu için bu projeyi aslında mobil gibi düşünebiliriz.
//Ben bu şekilde de yazılabilirliğininde görülmesi adına chrome,firefox ve edge driverlerını Webdriver içinde bıraktım.

public class DriverFactory {

    private DriverFactory(){}

    private static InheritableThreadLocal <WebDriver> driverPool = new InheritableThreadLocal<>();

    public static WebDriver get() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        if (driverPool.get() == null) {
            String browser = System.getProperty("browser") != null ? browser = System.getProperty("browser") : System.getenv("browser");
            switch (browser) {

               case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    break;
                case "edge":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows"))
                        throw new WebDriverException("Your OS doesn't support Edge");
                    WebDriverManager.edgedriver().setup();
                    driverPool.set(new EdgeDriver());

// appium'un cihazı görmesi için gerekli ayarlamalar yapılmıştır.

                case "samsung_S7":
                    desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
                    desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "300");
                    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-G935F");
                    desiredCapabilities.setCapability(MobileCapabilityType.UDID,"ce11160bbc1cae2401");
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");


                    try {
                        driverPool.set(new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities));
                    }
                    catch (MalformedURLException e){
                        e.printStackTrace();
                    }

                case "samsung_S10":
                    desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
                    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
                    desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "300");
                    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-G935F");
                    desiredCapabilities.setCapability(MobileCapabilityType.UDID,"ce11160bbc1cae2401");
                    desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");

                    try {
                        driverPool.set(new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),desiredCapabilities));
                    }
                    catch (MalformedURLException e){
                        e.printStackTrace();
                    }

            }
        }
        return  driverPool.get();
    }
    public static void closeDriver() {
        driverPool.get().quit();
        driverPool.remove();
    }

}






