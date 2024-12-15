
package pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPage extends BasePage {
    public CareersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".btn[href='https://jobs.lever.co/omnisend']")
    private WebElement viewJobsOpeningBtnElement;

    public void goToJobsPage() {
        viewJobsOpeningBtnElement.click();
    }
}
