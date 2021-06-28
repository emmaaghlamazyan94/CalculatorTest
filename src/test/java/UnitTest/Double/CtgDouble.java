package UnitTest.Double;

import UnitTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgDouble extends BaseTest {

    @Test(dataProvider = "values", groups = "double")
    public void ctgDoubleTest(double degrees, double expectedResult) {
        double radians = Math.toRadians(degrees);
        double ctg = calculator.ctg(radians);
        Assert.assertEquals(ctg, expectedResult, 0.1, "Invalid value");
    }

    @DataProvider(name = "values")
    public Object[][] doubleValuesForCtg() {
        return new Object[][]{
                {30.0, 1.0 / (Math.sqrt(3.0))},
                {60.0, Math.sqrt(3.0)}
        };
    }
}
//method calculator.ctg calculates tg value of the degree