package DataProviders;

import org.testng.annotations.DataProvider;

public class FourthAssigmentDataProviders {


    @DataProvider(name = "validValues")
    public static Object[][] getValidData() {
        return new Object[][]{
                {3.14, 1.21, 3.7994},
                {2.57, 5.0, 12.85},
                {100.54, 1.21, 121.6534},
                {5.45, 1.0, 5.45},
                {99.9999, 5.56, 555.9994439999999}
        };
    }


    @DataProvider(name = "invalidValues")
    public static Object[][] getInvalidData() {
        return new Object[][]{
                {3.14, -1.11},
                {-2.57, -5.38},
                {-1.54, 9.87},
                {0, 3.25},
                {1.25, 0}
        };


    }

    @DataProvider(name = "validValuesForRounding")
    public static Object[][] getValidDataForRounding() {
        return new Object[][]{
                {3.14, 1.21, 3.80},
                {2.57, 5.0, 12.85},
                {100.54, 1.21, 121.65},
                {5.45, 2.0, 10.90},
                {99.9999, 5.56, 556.00}

        };


    }
}

