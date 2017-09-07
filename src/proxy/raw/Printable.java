package proxy.raw;

public interface Printable {
    void setPrinterName(String name);
    String getPrinterName();
    void print(String string);
}
