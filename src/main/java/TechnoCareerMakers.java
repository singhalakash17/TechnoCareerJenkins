import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechnoCareerMakers {

    @FindBy(xpath = "//img[@alt='Google']")
    WebElement googleLogoImage;

    @FindBy(xpath = "//input[@value='Google Search']")
    WebElement googleSearchBtn;

    @FindBy(name = "q")
    WebElement searchTxtField;

    WebDriver webDriver;

    public TechnoCareerMakers(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void runRegressionTest(){
        webDriver.get("https://www.technocareermakers.com/business-analyst");
    }

    public void runSanityTest(){
        webDriver.get("https://www.technocareermakers.com/advance-automation-testing");
    }

    public void runSmokeTest(){
        webDriver.get("https://www.technocareermakers.com/softwaretesting");
    }

}
