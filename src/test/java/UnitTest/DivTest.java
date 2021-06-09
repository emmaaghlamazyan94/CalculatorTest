package UnitTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTest extends BaseTest {

    @Test(dataProvider = "values", groups = "doubleDivision")
    public void longDivisionTest(double firstNum, double secondNum, double expectedResult) {
        double div = calculator.div(firstNum, secondNum);
        Assert.assertEquals(div, expectedResult, 0.1, "Invalid result of division");
    }

    @DataProvider(name = "values")
    public Object[][] valuesForDiv() {
        return new Object[][]{
                {44, 4, 11},
                {11, 2, 5.5},
                {25, 5, 5},
                {5, 0, 0}
        };
    }
}
