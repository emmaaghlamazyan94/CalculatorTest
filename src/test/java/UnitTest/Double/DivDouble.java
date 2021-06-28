package UnitTest.Double;

import UnitTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivDouble extends BaseTest {

    @Test(dataProvider = "values", groups = "double")
    public void doubleDivTest(double firstNum, double secondNum, double expectedResult) {
        double div = calculator.div(firstNum, secondNum);
        Assert.assertEquals(div, expectedResult, 0.1, "Invalid result");
    }

    @DataProvider(name = "values")
    public Object[][] doubleValuesForDiv() {
        return new Object[][]{
                {44.4, 4.0, 11.1},
                {5.0, 0.0, Double.POSITIVE_INFINITY}
        };
    }
}