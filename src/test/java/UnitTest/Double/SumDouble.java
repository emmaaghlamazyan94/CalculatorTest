package UnitTest.Double;

import UnitTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDouble extends BaseTest {

    @Test(dataProvider = "values", groups = "double")
    public void doubleSumTest(double firstNum, double secondNum, double expectedResult) {
        double sum = calculator.sum(firstNum, secondNum);
        Assert.assertEquals(sum, expectedResult, 0.1, "Invalid result");
    }

    @DataProvider(name = "values")
    public Object[][] doubleValuesForSum() {
        return new Object[][]{
                {44.4, 4.0, 48.4}
        };
    }
}