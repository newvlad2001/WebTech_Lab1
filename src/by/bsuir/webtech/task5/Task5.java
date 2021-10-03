package by.bsuir.webtech.task5;

import by.bsuir.webtech.services.output.impl.ConsoleWriter;
import by.bsuir.webtech.services.output.interfaces.Writer;

public class Task5 {
    private static final int[] testArray = {10, 4, 5, 4, -5, 12, 8, -3, 0, 13};

    public static void main(String[] args) {
        Writer writer = new ConsoleWriter();
        int result = solveTask(testArray);

        writer.writeln("The minimum number of elements to remove is: " + result);
    }

    public static int solveTask(int[] arr) {
        int maxSeqLength = 1;

        for (int i = 0; i < arr.length; i++) {
            int currSeqLength = 1;
            int lastEl = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (lastEl < arr[j]) {
                    currSeqLength++;
                    lastEl = arr[j];
                }
            }
            maxSeqLength = Math.max(maxSeqLength, currSeqLength);
        }
        int result = arr.length - maxSeqLength;
        return result;
    }


}
