import Common.DTO;
import SecondTestData.FizzBuzzApplication;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestAssigment {

    private int increment = 1;
    private String expectedResult;
    private String actualValue;

    @Test
    public void testIfApplicationReturnsCorrectEntries() {

        for (int i = 1; i < DTO.desiredFizzBuzzEntryNumber + this.increment; i++) {
            if (i % 15 == 0) {
                this.expectedResult = "Fizz Buzz";
            } else if (i % 3 == 0) {
                this.expectedResult = "Fizz";
            } else if (i % 5 == 0) {
                this.expectedResult = "Buzz";
            } else {
                this.expectedResult = Integer.toString(i);
            }
            this.actualValue = FizzBuzzApplication.fizzBuzz(i);

            Assert.assertEquals(this.actualValue, this.expectedResult);

        }
    }
}
