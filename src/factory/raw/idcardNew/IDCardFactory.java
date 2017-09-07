package factory.raw.idcardNew;

import java.util.HashMap;
import java.util.Map;

import factory.raw.framework.Factory;
import factory.raw.framework.Product;

public class IDCardFactory extends Factory {
    private int number = 0;
    private Map<Integer, String> map = new HashMap<>();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, number);
    }

    @Override
    protected void registerProduct(Product product) {
        map.put(number++, ((IDCard)product).getOwner());
    }
    public Map<Integer, String> getDataBase() {
        return map;
    }
}
