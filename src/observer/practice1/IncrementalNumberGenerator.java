package observer.practice1;

public class IncrementalNumberGenerator extends NumberGenerator {
    int number;
    int endNum;
    int increment;
    public IncrementalNumberGenerator(int startNum, int endNum, int increment) {
        this.number = startNum;
        this.endNum = endNum;
        this.increment = increment;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        while (number < endNum) {
            notifyObservers();
            number += increment;
        }
    }

}
