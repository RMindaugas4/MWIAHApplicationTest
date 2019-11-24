import DataProviders.FourthAssigmentDataProviders;
import FourthTestData.TaxManager;
import FourthTestData.ValuesWasZeroOrNegativeException;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FourthTestAssigment {


    @Test(dataProvider = "validValues", dataProviderClass = FourthAssigmentDataProviders.class)
    public void testIfGrossAmountIsCalculatedCorrectly(double netAmount, double vatMultiplyer, double expectedResult) {

        double actualResult = TaxManager.getGrossAmount(netAmount, vatMultiplyer);

        Assert.assertEquals(actualResult, expectedResult,
                "Expected and actual does not match - value is calculated incorrectly");


    }

    @Test(dataProvider = "invalidValues", dataProviderClass = FourthAssigmentDataProviders.class, expectedExceptions = ValuesWasZeroOrNegativeException.class)
    public void testIfValuesCannotBeBelowZero(double netAmount, double vatMultiplyer) {

        double grossAmount = TaxManager.getGrossAmount(netAmount, vatMultiplyer);


    }

    @Test(dataProvider = "validValuesForRounding", dataProviderClass = FourthAssigmentDataProviders.class)
    public void testIfRoundingWorksCorrectly(double netAmount, double vatMultiplyer, double expectedResult) {
        double actualResult = TaxManager.getGrossAmountRounded(netAmount, vatMultiplyer);
        Assert.assertEquals(actualResult, expectedResult,
                "Expected and actual does not match - rounded value is calculated incorrectly");
    }
}
