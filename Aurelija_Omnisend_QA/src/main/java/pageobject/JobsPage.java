
package pageobject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobsPage extends BasePage {
    public JobsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".postings-wrapper")
    private List<WebElement> jobElements;

    @FindBy(css = ".filter-bar")
    private WebElement filterBarElement;

    public boolean hasAJobTitle(String expectedJobTitle) {
        waitForVisibilityOf(filterBarElement);
        for (WebElement jobElement : jobElements) {
            String jobTitle = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].textContent;", jobElement);
            if (jobTitle != null && jobTitle.contains(expectedJobTitle)) {
                return true;
            }
        }
        return false;
    }
}
