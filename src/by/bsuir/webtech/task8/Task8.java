package by.bsuir.webtech.task8;

import by.bsuir.webtech.services.output.impl.ConsoleWriter;
import by.bsuir.webtech.services.output.interfaces.Writer;

import java.util.Arrays;
import java.util.Stack;

public class Task8 {
    private static final double[] testSeq1 = {1, 2, 9, 12, 45};
    private static final double[] testSeq2 = {3, 7, 10, 28, 46, 50};

    public static void main(String[] args) {
        Writer writer = new ConsoleWriter();
        int[] result = findPositions(testSeq1, testSeq2);
        writer.writeln(Arrays.toString(result));
    }

    public static int[] findPositions(double[] seq1, double[] seq2) {
        var stack1 = initStack(seq1);
        var stack2 = initStack(seq2);
        var positions = new int[seq2.length];
        int index = 0;
        int currentPos = 0;

        while (!stack1.empty() && !stack2.empty()) {
            if (stack2.peek() < stack1.peek()) {
                stack2.pop();
                positions[index++] = currentPos;
            } else {
                stack1.pop();
            }
            currentPos++;
        }
        while (!stack2.empty()) {
            stack2.pop();
            positions[index++] = currentPos++;
        }
        return positions;
    }

    private static Stack<Double> initStack(double[] seq) {
        var stack = new Stack<Double>();

        for (int i = seq.length - 1; i > -1; i--) {
            stack.push(seq[i]);
        }
        return stack;
    }
}
