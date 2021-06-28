package UnitTest.Long;

import UnitTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultLong extends BaseTest {

    @Test(dataProvider = "values", groups = "long")
    public void longMultTest(long firstNum, long secondNum, long expectedResult) {
        long mult = calculator.mult(firstNum, secondNum);
        Assert.assertEquals(mult, expectedResult, 0.1, "Invalid result");
    }

    @DataProvider(name = "values")
    public Object[][] longValuesForMult() {
        return new Object[][]{
                {5, 9, 45}
        };
    }
}