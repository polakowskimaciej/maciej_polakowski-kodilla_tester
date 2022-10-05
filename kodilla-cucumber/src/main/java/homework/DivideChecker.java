package homework;

public class DivideChecker {
    public static String checkDivisability(int anInt) {
        if (anInt % 15 == 0) {
            return "FizzBuzz";
        } else if (anInt % 5 == 0) {
            return "Buzz";
        } else if (anInt % 3 == 0) {
            return "Fizz";
        }
        return "Nope";
    }
    }