package by.bsuir.webtech.task15_16.comparator;

import by.bsuir.webtech.task15_16.entity.Book;

import java.util.Comparator;

public class BookTitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int titleComparison = b1.getTitle().compareTo(b2.getTitle());
        return titleComparison == 0 ? b1.getAuthor().compareTo(b2.getAuthor()) : titleComparison;
    }
}
