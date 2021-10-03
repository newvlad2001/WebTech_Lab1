package by.bsuir.webtech.task6;

import by.bsuir.webtech.services.output.impl.ConsoleWriter;
import by.bsuir.webtech.services.output.interfaces.Writer;

public class Task6 {
    private static final double[] testArray = {0.1, 0.2, 0.3, 0.4, 0.5};

    public static void main(String[] args) {
        Writer writer = new ConsoleWriter();
        double[][] resultMatrix = fillMatrix(testArray);

        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                writer.write(resultMatrix[i][j] + " ");
            }
            writer.writeln("");
        }
    }

    public static double[][] fillMatrix(double[] arr) {
        int size = arr.length;
        double[][] result = new double[size][];
        result[0] = arr;

        for (int i = 1; i < size; i++) {
            result[i] = cycleShiftLeft(result[i - 1]);
        }
        return result;
    }

    public static double[] cycleShiftLeft(double[] arr) {
        double[] result = new double[arr.length];
        result[result.length - 1] = arr[0];

        System.arraycopy(arr, 1, result, 0, arr.length - 1);
        return result;
    }
}
