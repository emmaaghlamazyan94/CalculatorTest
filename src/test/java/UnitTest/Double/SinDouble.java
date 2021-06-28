package UnitTest.Double;

import UnitTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinDouble extends BaseTest {

    @Test(dataProvider = "values", groups = "double")
    public void doubleSinTest(double degrees, double expectedResult) {
        double radians = Math.toRadians(degrees);
        double sin = calculator.sin(radians);
        Assert.assertEquals(sin, expectedResult, 0.1, "Invalid result");
    }

    @DataProvider(name = "values")
    public Object[][] doubleValuesForSin() {
        return new Object[][]{
                {45.0, Math.sqrt(2) / 2},
                {60.0, Math.sqrt(3) / 2},
                {30.0, 1.0 / 2.0}
        };
    }
}