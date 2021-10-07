package by.bsuir.webtech.task8;

import by.bsuir.webtech.services.output.impl.ConsoleWriter;
import by.bsuir.webtech.services.output.Writer;

import java.util.Arrays;

public class Task8 {
    private static final double[] testSeq1 = {-5, 3, 4, 12, 45, 56};
    private static final double[] testSeq2 = {3, 7, 10, 28, 46, 50};

    public static void main(String[] args) {
        Writer writer = new ConsoleWriter();
        int[] result = findPositions(testSeq1, testSeq2);

        writer.writeln(Arrays.toString(result));
    }

    public static int[] findPositions(double[] seq1, double[] seq2) {
        int[] positions = new int[seq2.length];
        int seq2Index = 0;
        int currPos = 0;

        for (int seq1Index = 0; seq1Index < seq1.length && seq2Index < seq2.length; seq1Index++, currPos++) {
            if (seq2[seq2Index] < seq1[seq1Index]) {
                positions[seq2Index++] = currPos;
                seq1Index--;
            }
        }
        while (seq2Index < seq2.length) {
            positions[seq2Index++] = currPos++;
        }
        return positions;
    }
}
