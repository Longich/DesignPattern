package singleton.practice1;

public class Test {
    public static void main(String[] args) {
        TicketMaker maker = TicketMaker.getInstance();
        System.out.println(maker.getNextTicketNumber());
        System.out.println(maker.getNextTicketNumber());
        System.out.println(maker.getNextTicketNumber());
        System.out.println(maker.getNextTicketNumber());
    }
}
