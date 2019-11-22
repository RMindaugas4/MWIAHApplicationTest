package Common;

import net.bytebuddy.utility.RandomString;

import java.util.Random;

public class Utils {


    public static String randomStringGenerator(int maxStringLength) {
        return RandomString.make(maxStringLength);
    }

    public static int randomIntegerGenerator(int maxIntValue){
        return new Random().nextInt(maxIntValue);
    }



}