package head_first_patterns._06adapter;

/**
 * Created by ivan on 15.07.17.
 */
public class PolicemanMilitionerAddapter extends Policeman {

    private Militioner militioner;

    public PolicemanMilitionerAddapter(Militioner militioner) {
        this.militioner = militioner;
    }

    @Override
    public void doGoodJob() {
        militioner.serve();
    }
}
