package conf;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;

public class Config {
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gonch\\OneDrive\\Рабочий стол\\Extensions\\chromedriver.exe");
    }

    public static Path currentRelativePath = Paths.get("C:\\Users\\gonch\\OneDrive\\Рабочий стол\\Extensions\\modheader.crx");
    public static ChromeOptions options = new ChromeOptions();

    static {
        options.addExtensions(new File(currentRelativePath.toAbsolutePath().toString()));
    }

    protected static String RESOURCES_DIR = "resources\\";

    public static WebDriver driver = new ChromeDriver(options);
    public static String BasePage = "http://pbs-testing.ec-tavrida.ru/#/app/home";
//    http://pbs-ift.ec-tavrida.ru/#/app/home
    public static void setDriverRequest(String RoleOrPath) {

        System.setProperty("webdriver.chrome.silentOutput", "true");
        java.util.logging.Logger.getLogger("com.codeborne.selenide").setLevel(Level.OFF);
        Configuration.browser = "chrome";

        driver.manage().window().maximize();
        driver.get(RoleOrPath);

        System.setProperty("log4j.configurationFile", RESOURCES_DIR + "log4j2.xml");

    }
}
