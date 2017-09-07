package singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        Singleton obj = Singleton.getInstance();
        System.out.println("");
        Singleton obj2 = Singleton.getInstance();
        if (obj == obj2) {
            System.out.println("obj == obj2");
        } else {
            System.out.println("obj != obj2");
        }
        System.out.println("end");
    }
}
