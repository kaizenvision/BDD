package hooks;

import com.aventstack.extentreports.reporter.FileUtil;
import com.base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class MyHook extends BaseClass {
    @Before( order = 1)
    public void test() {
        System.out.println("in before hook order 1");
    }

    @Before( order = 2)
    public void test2() {
        System.out.println("in before hook order 2");
    }

    @After
    public void test1(Scenario scenario) {
        if(scenario.isFailed()) {
            File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          //  FileUtils.copyFile(file,);
        }
        System.out.println("in after hook");
    }
}
