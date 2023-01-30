import Base.BaseTest;
import Pages.AllPages;
import Utilities.ConfigReader;
import org.testng.annotations.Test;

public class TC002 extends BaseTest {

    AllPages allPages = new AllPages();

    @Test
    public void test02(){
        allPages.mainPage().go_To_Url(ConfigReader.getProperty("baseURL"));
        allPages.userDashboardPage().searchElement("nutella");




    }
}
