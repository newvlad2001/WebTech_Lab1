package by.bsuir.webtech.introtasks.services.output.interfaces;

public interface Writer {
    void write(String s);

    void writeln(String s);

    void writef(String format, Object... args);
}
