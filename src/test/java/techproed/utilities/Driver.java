package techproed.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /*
    ThreadLocal classi javada her threade ozgu variablelar saklamak icin kullanilir,
    PARALEL TESTLER YAPARKEN ==> ThreadLocal<WebDriver> kullanimi threadler arasinda izolasyon saglar
    dolayisiyla her bir threadin kendi webdriver objectine sahip olmasini saglar, bu sayede paralel test yaparken
    testlerin birbirinden bagimsiz ve stabil bir seklide calismasini saglar
     */
    // ThreadLocal ile her thread için ayrı bir WebDriver objesi oluşturuyoruz.
    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driverPool.get() == null) {
            // WebDriver i thread bazında oluşturuyoruz.
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    driverPool.set(new ChromeDriver());
                    break;
                case "edge":
                    driverPool.set(new EdgeDriver());
                    break;
                case "safari":
                    driverPool.set(new SafariDriver());
                    break;
                case "firefox":
                    driverPool.set(new FirefoxDriver());
                    break;
                default:
                    driverPool.set(new ChromeDriver());
            }

            // Oluşturulan WebDriveri yapılandırıyoruz.
            driverPool.get().manage().window().maximize();
            driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        // Thread'a özgü WebDriver objecti return ediyoruz.
        return driverPool.get();
    }

    private Driver() {
        // Singleton pattern
    }

    public static void closeDriver() {
        // Açık olan WebDriver örneğini kapatıyoruz.
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove(); // ThreadLocal'daki referansı temizliyoruz.
        }
    }
}
