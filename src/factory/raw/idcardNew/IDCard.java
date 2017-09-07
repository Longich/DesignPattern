package factory.raw.idcardNew;

import factory.raw.framework.Product;

public class IDCard implements Product {
    public String owner;
    public int number;
    public IDCard(String owner, int number) {
        System.out.println(owner + "(" + number + ")" + "のカードを作ります");
        this.owner = owner;
        this.number = number;
    }
    @Override
    public void use() {
        System.out.println(owner + "(" + number + ")" + "のカードを使います");
    }
    public String getOwner() {
        return owner;
    }
    public int getNumber() {
        return number;
    }
}
