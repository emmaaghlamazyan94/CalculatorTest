package UnitTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTest {
    @Test(dataProvider = "values", groups = "longSum")
    public void sumTest(long firstNum, long secondNum, long expectedResult) {
        long actualResult = calculator.sum(firstNum, secondNum);
        Assert.assertEquals(actualResult, expectedResult, "Invalid result of sum");
    }

    @DataProvider(name = "values")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {10, 11, 21},
                {5, -4, 1},
                {7, 0, 7}
        };
    }
}