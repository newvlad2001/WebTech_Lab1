package by.bsuir.webtech.task12_14.entity;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, String language, int price, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();

        hash = 31 * hash + language.hashCode();
        hash = 31 * hash + Integer.hashCode(level);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        ProgrammerBook book = (ProgrammerBook) obj;
        return Objects.equals(this.language, book.language) && level == book.level;
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "language=" + language +
                ", level=" + level +
                "} " + super.toString();
    }
}
