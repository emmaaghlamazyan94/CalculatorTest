package UnitTest.Long;

import UnitTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Negative extends BaseTest {

    @Test(dataProvider = "values", groups = "long")
    public void isNegativeTest(long num) {
        boolean isNegative = calculator.isNegative(num);
        Assert.assertTrue(isNegative, "The number is positive");
    }

    @DataProvider(name = "values")
    public Object[][] longValuesForNegativity() {
        return new Object[][]{
                {-50000},
                {0},
                {12}
        };
    }
}