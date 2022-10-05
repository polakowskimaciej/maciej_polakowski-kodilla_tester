package homework;

public class DivideChecker {
    public static String checkDivisability(int anInt) {
        if (anInt % 3 == 0) {
            if (anInt % 5 == 0) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (anInt % 5 == 0) {
            return "Buzz";
        } else {
            return "Nope";
        }
    }
}

