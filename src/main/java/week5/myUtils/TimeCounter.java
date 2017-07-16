package week5.myUtils;

/**
 * Created by ivan on 13.07.17.
 */
public class TimeCounter {

    public static long countActionTime(TimeAction timeAction) {

        long start = System.currentTimeMillis();
        timeAction.callWrappedAction();
        long end = System.currentTimeMillis();

        return end - start;
    }
}
