package circus;

/**
 * Created by ivan on 15.06.17.
 */
public abstract class Artist {

    public final static double RISK_COF = 1;
    private String name;
    private int perCount = 0;
    private double salary;
    private double riskFactor;
    private String classOfArtist;

    public Artist(String name, double salary) {
        this.name = name;
        this.salary = salary;
        classOfArtist = identifyClassOfArtist();

    }

    public String getClassOfArtist() {
        return classOfArtist;
    }

    private String identifyClassOfArtist(){
        return getClass().getCanonicalName().substring(1 + getClass().getCanonicalName().indexOf("."));
    }

    public abstract void showPerformance();

    public void getSalary(double salary){
        this.salary = salary * riskFactor + this.salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(double riskFactor) {
        this.riskFactor = riskFactor;
    }

    public void setSalary(double salary) {
        this.salary = salary * riskFactor;
    }

    @Override
    public String toString() {
        return "Artist {" +
                "name = " + name  +
                ", salary = " + salary +
                ", riskFactor = " + riskFactor +
                ", classOfArtist = " + classOfArtist +
                '}';
    }

    public int getPerCount() {
        return perCount;
    }

    public void setPerCount(int perCount) {
        this.perCount = perCount;
    }
}
