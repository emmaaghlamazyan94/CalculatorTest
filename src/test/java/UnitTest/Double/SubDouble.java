package UnitTest.Double;

import UnitTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubDouble extends BaseTest {

    @Test(dataProvider = "values", groups = "double")
    public void doubleSubTest(double firstNum, double secondNum, double expectedResult) {
        double sub = calculator.sub(firstNum, secondNum);
        Assert.assertEquals(sub, expectedResult, 0.1, "Invalid result");
    }

    @DataProvider(name = "values")
    public Object[][] doubleValuesForSub() {
        return new Object[][]{
                {44.4, 4.0, 40.4}
        };
    }
}