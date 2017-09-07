package Flyweight.practice1;

import java.util.ArrayList;
import java.util.List;

public class BigString {
    private List<BigChar> bigchars;
    public BigString(String string) {
        initWithFactory(string);
    }
    public BigString(String string, boolean shared) {
        if(shared) {
            initWithFactory(string);
        } else {
            initWithoutFactory(string);
        }
    }
    private void initWithFactory(String string) {
        bigchars = new ArrayList<>();
        BigCharFactory factory = BigCharFactory.getinstance();
        for (int i = 0; i < string.length(); i++) {
            bigchars.add(factory.getBigChar(string.charAt(i)));
        }
    }
    private void initWithoutFactory(String string) {
        bigchars = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            bigchars.add(new BigChar(string.charAt(i)));
        }
    }
    public void print() {
        for (int i = 0; i < bigchars.size(); i++) {
            bigchars.get(i).print();
        }
    }
}
