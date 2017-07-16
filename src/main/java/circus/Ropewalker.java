package circus;

/**
 * Created by ivan on 15.06.17.
 */
public class Ropewalker extends Artist {

    public static final double ADDITIONAL_RISK = 0.4;

    public Ropewalker(String name, double salary) {
        super(name, salary);
        setRiskFactor(RISK_COF + ADDITIONAL_RISK);
    }

    @Override
    public void showPerformance() {
        System.out.println("Ropewalker show great performance!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
