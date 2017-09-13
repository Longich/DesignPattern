package Builder.raw;

public abstract class Builder {
    boolean isTitleMade = false;
    
    public void makeTitle(String title) {
        buildTitle(title);
        isTitleMade = true;
    };
    public void makeString(String str) {
        if (isTitleMade) {
            buildString(str);
        }
    }
    public void makeItems(String[] items) {
        if (isTitleMade) {
            buildItems(String[] items);
        }
    }

    public void close() {
        if (isTitleMade) {
            endBuild();
        }
    }
    public abstract void buildTitle(String title);
    public abstract void buildString(String str);
    public abstract void buildItems(String[] items);
    public abstract void endBuild();
}
