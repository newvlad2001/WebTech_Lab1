package by.bsuir.webtech.introtasks.services.input.impl;

import by.bsuir.webtech.introtasks.services.input.interfaces.Reader;

import java.util.Scanner;

public class ConsoleReader implements Reader {

    private final Scanner SCANNER = new Scanner(System.in);

    @Override
    public int readInt() {
        int number;

        while (!SCANNER.hasNextInt()) {
            SCANNER.next();
        }
        number = SCANNER.nextInt();
        return number;
    }

    @Override
    public double readDouble() {
        double number;

        while (!SCANNER.hasNextDouble()) {
            SCANNER.next();
        }
        number = SCANNER.nextDouble();
        return number;
    }

    @Override
    public int readPositiveInt() {
        int number;

        do {
            while (!SCANNER.hasNextInt()) {
                SCANNER.next();
            }
            number = SCANNER.nextInt();
        } while (number < 0);
        return number;
    }

    @Override
    public double readPositiveDouble() {
        double number;

        do {
            while (!SCANNER.hasNextDouble()) {
                SCANNER.next();
            }
            number = SCANNER.nextDouble();
        } while (number < 0);
        return number;
    }

}
