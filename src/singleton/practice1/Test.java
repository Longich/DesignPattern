package singleton.practice1;

public class Test {
    public static void main(String[] args) {
        TicketMaker2 maker = TicketMaker2.Instance;
        System.out.println(maker.takeNextNumber());
        System.out.println(maker.takeNextNumber());
        System.out.println(maker.takeNextNumber());
        System.out.println(maker.takeNextNumber());
        System.out.println(maker.takeNextNumber());
        
    }
}
