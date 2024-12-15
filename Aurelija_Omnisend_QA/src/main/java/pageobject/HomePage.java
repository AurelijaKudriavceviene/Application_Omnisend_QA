
package pageobject;
import helpers.ScrollingHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[title='Careers']")
    private WebElement careersBtnElement;

    public void goToCareersPage() {
        waitForVisibilityOf(cookiesBtnElement);
        cookiesBtnElement.click();
        ScrollingHelper.scrollToElement(driver, careersBtnElement, 10);
        careersBtnElement.click();
    }
}
