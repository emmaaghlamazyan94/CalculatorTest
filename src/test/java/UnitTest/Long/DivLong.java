package UnitTest.Long;

import UnitTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivLong extends BaseTest {

    @Test(dataProvider = "values", groups = "long")
    public void longDivisionTest(long firstNum, long secondNum, long expectedResult) {
        long div = calculator.div(firstNum, secondNum);
        Assert.assertEquals(div, expectedResult, 0.1, "Invalid result of division");
    }

    @DataProvider(name = "values")
    public Object[][] longValuesForDiv() {
        return new Object[][]{
                {44, 4, 11},
                {16, 2, 8},
                {25, 5, 5},
                {5, 0, 0}
        };
    }
}