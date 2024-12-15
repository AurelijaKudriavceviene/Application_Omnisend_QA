
import handlers.WindowHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.CareersPage;
import pageobject.HomePage;
import pageobject.JobsPage;

public class JuniorQAPositionTest extends BaseTest {

    @Test
    void searchingForJobTitle() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        JobsPage jobsPage = new JobsPage(driver);
        WindowHandler windowHandler = new WindowHandler(driver);

        String jobTitle = "Junior Quality Assurance";

        homePage.goToCareersPage();
        careersPage.goToJobsPage();
        windowHandler.switchToNewWindow();

        boolean isThereJuniorQAPosition = jobsPage.hasAJobTitle(jobTitle);
        Assertions.assertTrue(isThereJuniorQAPosition, "So sad, there are no junior QA positions at the moment");
    }
}
