package by.bsuir.webtech.task7;

import by.bsuir.webtech.services.output.impl.ConsoleWriter;
import by.bsuir.webtech.services.output.interfaces.Writer;

public class Task7 {
    private static final double[] testArray = {1.0, -0.3, -1.0, 2.0, 2.2, -1.0};

    public static void main(String[] args) {
        sort(testArray);
        printArray(new ConsoleWriter(), testArray);
    }

    public static void sort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            i = Math.max(i, 0);
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
                i -= 2;
            }
        }
    }

    private static void swap(double[] arr, int i1, int i2) {
        double tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }

    public static void printArray(Writer writer, double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            writer.write(arr[i] + " ");
        }
        writer.writeln("");
    }
}
