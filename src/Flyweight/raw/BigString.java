package Flyweight.raw;

import java.util.ArrayList;
import java.util.List;

public class BigString {
    private List<BigChar> bigchars;
    public BigString(String string) {
        bigchars = new ArrayList<>();
        BigCharFactory factory = BigCharFactory.getinstance();
        for (int i = 0; i < string.length(); i++) {
            bigchars.add(factory.getBigChar(string.charAt(i)));
        }
    }
    public void print() {
        for (int i = 0; i < bigchars.size(); i++) {
            bigchars.get(i).print();
        }
    }
}
