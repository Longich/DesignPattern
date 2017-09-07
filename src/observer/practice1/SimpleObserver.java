package observer.practice1;

public class SimpleObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("SimpleObserver:" + generator.getNumber());
    }

}
