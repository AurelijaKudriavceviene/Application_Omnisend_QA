
package handlers;
import org.openqa.selenium.WebDriver;
import java.util.Set;

public class WindowHandler {
    private final WebDriver driver;
    private final String originalWindow;

    public WindowHandler(WebDriver driver) {
        this.driver = driver;
        this.originalWindow = driver.getWindowHandle();
    }

    public void switchToNewWindow() {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
            }
        }
    }

    public void switchToOriginalWindow() {
        driver.switchTo().window(originalWindow);
    }
}
