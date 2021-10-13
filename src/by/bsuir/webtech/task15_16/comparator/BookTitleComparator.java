package by.bsuir.webtech.task15_16.comparator;

import by.bsuir.webtech.task15_16.entity.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle());
    }
}
