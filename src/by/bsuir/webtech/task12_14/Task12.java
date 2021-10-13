package by.bsuir.webtech.task12_14;

import by.bsuir.webtech.task12_14.entity.Book;
import by.bsuir.webtech.task12_14.entity.ProgrammerBook;

public class Task12 {
    public static void main(String[] args) {
        ProgrammerBook programmerBook = new ProgrammerBook("s", "s", "j", 5, 1);
        Book programmerBook1  = new ProgrammerBook("s", "s", "j", 5, 1);
        Book book = new Book("s", "s", 5);

        System.out.println(programmerBook.equals(programmerBook1));
        System.out.println(programmerBook1.equals(programmerBook));
        System.out.println(programmerBook.equals(book));
        System.out.println(book.equals(programmerBook));
        System.out.println(programmerBook1.equals(book));
        System.out.println(book.equals(programmerBook1));
    }
}
