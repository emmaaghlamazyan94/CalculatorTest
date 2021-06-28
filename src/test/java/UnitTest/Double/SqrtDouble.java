package UnitTest.Double;

import UnitTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtDouble extends BaseTest {

    @Test(dataProvider = "values", groups = "double")
    public void doubleSqrtTest(double num, double expectedResult) {
        double sqrt = calculator.sqrt(num);
        Assert.assertEquals(sqrt, expectedResult, 0.1, "Invalid result");
    }

    @DataProvider(name = "values")
    public Object[][] doubleValuesForSqrt() {
        return new Object[][]{
                {16.0, 4.0},
                {-25.0,5.0}
        };
    }
}
//method calculates negative number square root