import Common.DTO;
import FourthTestData.TaxManager;
import FourthTestData.ValuesWasZeroOrNegativeException;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FourthTestAssigment {


    @Test
    public void testIfGrossAmountIsCalculatedCorrectly() {

        double netAmount = 3.57;
        double vatMultiplyer = DTO.valueAddedTaxMultiplyer;
        double expectedResult = 4.3197;
        double actualResult = TaxManager.getGrossAmount(netAmount, vatMultiplyer);

        Assert.assertEquals(actualResult, expectedResult,
                "Expected and actual does not match - value is calculated incorrectly");


    }

    @Test
    public void testIfValuesCannotBeBelowZero() {

        boolean wasExpectionThrown = false;
        double netAmount = 3.57;
        double vatMultiplyer = -1;

        try{
        double grossAmount = TaxManager.getGrossAmount(netAmount,vatMultiplyer);
        }
        catch (ValuesWasZeroOrNegativeException e){
            wasExpectionThrown = true;
            e.printStackTrace();
        }

        Assert.assertTrue(wasExpectionThrown);

    }

    @Test
    public void testIfRoundingWorksCorrectly() {
        double netAmount = 3.57;
        double vatMultiplyer = DTO.valueAddedTaxMultiplyer;
        double expectedResult = 4.32;
        double actualResult = TaxManager.getGrossAmountRounded(netAmount, vatMultiplyer);
        Assert.assertEquals(actualResult, expectedResult,
                "Expected and actual does not match - rounded value is calculated incorrectly");
    }
}
