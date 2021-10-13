package by.bsuir.webtech.task15_16.entity;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private String isbn;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
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
    public int compareTo(Book b) {
        return Integer.parseInt(this.isbn.replace("-", ""))
                - Integer.parseInt(b.isbn.replace("-", ""));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }
}