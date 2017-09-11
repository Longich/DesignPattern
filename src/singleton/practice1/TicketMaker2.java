package singleton.practice1;

public enum TicketMaker2 {
    Instance;
    
    private int number = 1000;
    
    public int takeNextNumber() {
        return number++;
    }
}
