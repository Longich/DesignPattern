package factory.raw;

import factory.raw.framework.Factory;
import factory.raw.framework.Product;
import factory.raw.idcardNew.IDCardFactory;

public class Main2 {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("結城浩");
        Product card2 = factory.create("とむら");
        Product card3 = factory.create("佐藤花子");
        card1.use();
        card2.use();
        card3.use();
    }
}
