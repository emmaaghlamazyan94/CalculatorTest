package UnitTest.Double;

import UnitTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultDouble extends BaseTest {

    @Test(dataProvider = "values", groups = "double")
    public void doubleMultTest(double firstNum, double secondNum, double expectedResult) {
        double mult = calculator.mult(firstNum, secondNum);
        Assert.assertEquals(mult, expectedResult, 0.1, "Invalid result");
    }

    @DataProvider(name = "values")
    public Object[][] doubleValuesForMult() {
        return new Object[][]{
                {5.0, 9.0, 45.0},
                {0.0, 10000.0, 0.0}
        };
    }
}