import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLoginFunctionality {

    WebDriver webDriver;

    TechnoCareerMakers technoCareerMakers;

    @BeforeMethod(alwaysRun = true)
    public void beforeTestMethod(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.technocareermakers.com/");
        technoCareerMakers = new TechnoCareerMakers(webDriver);
    }

    @Test(groups = {"smoke"})
    public void smokeTestCase(){
        technoCareerMakers.runSmokeTest();
    }

    @Test(groups = {"sanity"})
    public void sanityTestCase(){
        technoCareerMakers.runSanityTest();
    }

    @Test(groups = {"regression"})
    public void regressionTestCase(){
        technoCareerMakers.runRegressionTest();
    }

    @Test(groups = {"applicationcode"})
    public void devTestCase(){
        System.out.println("I am developer code only");
    }

    @AfterMethod(alwaysRun = true)
    public void afterTestMethod(){
        webDriver.quit();
    }

}
