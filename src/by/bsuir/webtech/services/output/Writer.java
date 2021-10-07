package by.bsuir.webtech.services.output;

public interface Writer {
    void write(String s);

    void writeln(String s);

    void writef(String format, Object... args);
}
