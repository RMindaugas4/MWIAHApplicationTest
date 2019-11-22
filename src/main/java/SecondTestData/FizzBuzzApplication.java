package SecondTestData;

public class FizzBuzzApplication {


    public static String fizzBuzz(int number) {

        if (number % 15 == 0) {
            return "Fizz Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else return Integer.toString(number);
    }
}
