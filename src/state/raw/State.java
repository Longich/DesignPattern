package state.raw;

public interface State {
    void doClock(Context context, int hour);
    void doUse(Context context);
    void doAlerm(Context context);
    void doPhone(Context context);
}
