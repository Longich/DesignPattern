package state.raw;

public class LunchState implements State {
    private static LunchState singleton = new LunchState();
    private LunchState(){}
    public static LunchState getInstance(){
        return singleton;
    }
    
    @Override
    public void doClock(Context context, int hour) {
        if ((9 <= hour && hour < 12) || (13 <= hour && hour < 18)) {
            context.changeState(DayState.getInstance());
        } else if (hour < 9 || 18 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("非常：昼休みの金庫使用");
    }

    @Override
    public void doAlerm(Context context) {
        context.callSecurityCenter("非常ベル（昼休み）");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("昼休みの通話録音");
    }
    
    public String toString() {
        return "（昼休み）";
    }
}
