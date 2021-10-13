package by.bsuir.webtech.task15_16.comparator;

import by.bsuir.webtech.task15_16.entity.Book;

import java.util.Comparator;

public class BookAuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        var comparator = new BookAuthorTitleComparator();
        int authorTitleComparison = comparator.compare(b1, b2);
        return authorTitleComparison == 0 ? b1.getPrice() - b2.getPrice() : authorTitleComparison;
    }
}
