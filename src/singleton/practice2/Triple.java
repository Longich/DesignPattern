package singleton.practice2;

public class Triple {
    private static Triple one = new Triple();
    private static Triple two = new Triple();
    private static Triple three = new Triple();
    
    private static int count = 1;
    
    private Triple() {}
    
    public static Triple getInstance(int i) {
        switch(i) {
        case 1:
            return one;
        case 2:
            return two;
        case 3:
            return three;
        default:
            return null;
        }
    }
    
    public int getCount() {
        return count++;
    }
}
