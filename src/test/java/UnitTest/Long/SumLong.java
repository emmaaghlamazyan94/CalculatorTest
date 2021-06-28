package UnitTest.Long;

import UnitTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLong extends BaseTest {

    @Test(dataProvider = "values", groups = "long")
    public void sumTest(long firstNum, long secondNum, long expectedResult) {
        long actualResult = calculator.sum(firstNum, secondNum);
        Assert.assertEquals(actualResult, expectedResult, "Invalid result of sum");
    }

    @DataProvider(name = "values")
    public Object[][] longValuesForSum() {
        return new Object[][]{
                {10, 11, 21},
                {5, -4, 1},
                {7, 0, 7}
        };
    }
}