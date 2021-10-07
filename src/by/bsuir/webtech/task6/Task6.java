package by.bsuir.webtech.task6;

import by.bsuir.webtech.services.output.impl.ConsoleWriter;
import by.bsuir.webtech.services.output.Writer;

public class Task6 {
    private static final double[] testArray = {0.1, 0.2, 0.3, 0.4, 0.5};

    public static void main(String[] args) {
        Writer writer = new ConsoleWriter();
        double[][] resultMatrix = fillMatrix(testArray);

        printMatrix(writer, resultMatrix);
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

    public static void printMatrix(Writer writer, double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                writer.write(matrix[i][j] + " ");
            }
            writer.writeln("");
        }
    }
}
