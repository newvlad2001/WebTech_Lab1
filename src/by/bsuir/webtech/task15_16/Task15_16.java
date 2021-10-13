package by.bsuir.webtech.task15_16;

import by.bsuir.webtech.task15_16.comparator.BookAuthorTitleComparator;
import by.bsuir.webtech.task15_16.comparator.BookTitleAuthorComparator;
import by.bsuir.webtech.task15_16.comparator.BookTitleComparator;
import by.bsuir.webtech.task15_16.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class Task15_16 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("A", "B", 1));
        books.add(new Book("C", "C", 1));
        books.add(new Book("A", "A", 1));

        books.sort(new BookTitleComparator());
        System.out.println("Title");
        for (var b : books) {
            System.out.println(b);
        }

        books.sort(new BookTitleAuthorComparator());
        System.out.println("Title-Author");
        for (var b : books) {
            System.out.println(b);
        }
    }
}
