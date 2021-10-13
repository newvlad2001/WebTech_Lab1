package by.bsuir.webtech.task15_16.comparator;

import by.bsuir.webtech.task15_16.entity.Book;

import java.util.Comparator;

public class BookAuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int authorComparison = b1.getAuthor().compareTo(b2.getAuthor());
        return authorComparison == 0 ? b1.getTitle().compareTo(b2.getTitle()) : authorComparison;
    }
}
