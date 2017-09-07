package state.raw;

public class NightState implements State {
    private static NightState singleton = new NightState();
    private NightState(){}
    public static NightState getInstance() {
        return singleton;
    }
    @Override
    public void doClock(Context context, int hour) {
        if (12 <= hour && hour < 13) {
            context.changeState(LunchState.getInstance());
        } else if (9 <= hour && hour < 18) {
            context.changeState(DayState.getInstance());
        }
    }
    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("非常：夜間の金庫使用");
    }
    @Override
    public void doAlerm(Context context) {
        context.callSecurityCenter("非常ベル（夜間）");
    }
    @Override
    public void doPhone(Context context) {
        context.recordLog("夜間の通話録音");
    }
    
    public String toString() {
        return "（夜間）";
    }
}
