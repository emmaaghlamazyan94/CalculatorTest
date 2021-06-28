package UnitTest.Double;

import UnitTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgDouble extends BaseTest {

    @Test(dataProvider = "values", groups = "double")
    public void doubleTgTest(double degree1, double degree2, double expectedResult) {
        double sinDegrees = Math.sin(Math.toRadians(degree1));
        double cosDegrees = Math.cos(Math.toRadians(degree2));
        double tg = calculator.tg(sinDegrees / cosDegrees);

        Assert.assertEquals(tg, expectedResult, 0.1, "Invalid result");
    }

    @DataProvider(name = "values")
    public Object[][] doubleValuesForTg() {
        return new Object[][]{
                {60.0, 45.0, Math.sqrt(3.0) / Math.sqrt(2.0)},
                {30.0, 60.0, 1.0},
                {60.0, 60.0, Math.sqrt(2.0)}
        };
    }
}
//as calculator.cos method calculates sin value of the degree, calculator.tg method calculates sin/sin, so the result is invalid