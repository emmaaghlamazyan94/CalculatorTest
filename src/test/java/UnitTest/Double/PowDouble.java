package UnitTest.Double;

import UnitTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowDouble extends BaseTest {

    @Test(dataProvider = "values", groups = "double")
    public void doublePowTest(double firstNum, double secondNum, double expectedResult) {
        double pow = calculator.pow(firstNum, secondNum);
        Assert.assertEquals(pow, expectedResult, 0.1, "Invalid result");
    }

    @DataProvider(name = "values")
    public Object[][] doubleValuesForPow() {
        return new Object[][]{
                {5.0, 3.0, 125.0},
                {555555.5, 0.0, 1.0}
        };
    }
}