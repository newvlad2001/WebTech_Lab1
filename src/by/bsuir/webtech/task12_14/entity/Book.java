package by.bsuir.webtech.task12_14.entity;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;

        hash = 31 * hash + Integer.hashCode(price);
        hash = 31 * hash + (title == null ? 0 : title.hashCode());
        hash = 31 * hash + (author == null ? 0 : author.hashCode());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return Objects.equals(this.author, book.author)
                && Objects.equals(this.title, book.title)
                && this.price == book.price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title=" + title +
                ", author=" + author +
                ", price=" + price +
                "}";
    }

    @Override
    public Book clone() {
        return new Book(this.title, this.author, this.price);
    }
}