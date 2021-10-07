package by.bsuir.webtech.task4;

import by.bsuir.webtech.services.output.impl.ConsoleWriter;
import by.bsuir.webtech.services.output.Writer;
import by.bsuir.webtech.task4.util.PrimeUtils;

public class Task4 {
    static Writer writer = new ConsoleWriter();
    private static final int[] array = {1, 3, 46, 12, 19, 22, 101, 11};

    public static void main(String[] args) {
        outputIndexesOfPrimes(array);
    }

    public static void outputIndexesOfPrimes(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (PrimeUtils.isPrime(array[i])) {
                writer.write(i + " ");
            }
        }
        writer.writeln("");
    }
}
