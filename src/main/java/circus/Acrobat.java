package circus;

/**
 * Created by ivan on 16.06.17.
 */
public class Acrobat extends Artist {

    private int promille;

    public Acrobat(String name, double salary) {
        super(name, salary);
        setRiskFactor(RISK_COF);
        this.promille = (int) (Math.random() * 100);
    }

    @Override
    public void showPerformance() {
        System.out.println("Do something interesting");
    }

    public int getPromille() {
        return promille;
    }
}
