package adapter.raw;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
        
        PrintBanner2 p2 = new PrintBanner2("Hello2");
        p2.printWeak();
        p2.printStrong();
    }
}
