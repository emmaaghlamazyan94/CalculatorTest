package UnitTest.Double;

import UnitTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosDouble extends BaseTest {

    @Test(dataProvider = "values", groups = "double")
    public void cosDoubleTest(double degrees, double expectedResult) {
        double radians = Math.toRadians(degrees);
        double cos = calculator.cos(radians);

        Assert.assertEquals(cos, expectedResult, 0.1, "Invalid value");
    }

    @DataProvider(name = "values")
    public Object[][] doubleValuesForCos() {
        return new Object[][]{
                {45.0, Math.sqrt(2.0) / 2.0},
                {30.0, Math.sqrt(3.0) / 2.0},
                {60.0, 1.0 / 2.0}
        };
    }
}
//method calculator.cos calculates sin value of the degree