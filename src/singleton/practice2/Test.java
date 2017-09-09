package singleton.practice2;

public class Test {
    public static void main(String[] args) {
        Triple one = Triple.getInstance(1);
        Triple two = Triple.getInstance(2);
        Triple three = Triple.getInstance(3);
        System.out.println(one.getCount());
        System.out.println(two.getCount());
        System.out.println(three.getCount());
    }
}
