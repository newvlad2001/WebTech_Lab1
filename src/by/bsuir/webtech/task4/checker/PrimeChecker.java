package by.bsuir.webtech.task4.checker;

public class PrimeChecker {
    private PrimeChecker() {}

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
