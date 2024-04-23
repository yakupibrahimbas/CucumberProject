package techproed.hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.utilities.Driver;

public class Hook {
//
  //  @Before
  //  public void setUp() throws Exception {
  //      System.out.println("Hooks classtaki @Before methodu tum scenariolardan once calistirilir");
  //  }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if(scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/png","scenario"+scenario.getName());
            Driver.closeDriver();
        }
    }



    @Before("@ford")
    public void setUp2() throws Exception {
        System.out.println("sadece @ford tagi olan scenariolardan once calistirilir");
    }

    @After("@volvo")
    public void tearDown2() throws Exception {
        System.out.println("sadece @volvo tagi olan scenariolardan sonra calistirilir");
    }


}