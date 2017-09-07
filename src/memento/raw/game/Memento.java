package memento.raw.game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Memento implements Serializable {
    int money;
    List<String> fruits;
    
    public int getMoney() {
        return money;
    }
    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }
    void addFruit(String fruit) {
        fruits.add(fruit);
    }
    List<String> getFruits() {
        return fruits;
    }
}
