package head_first_patterns._06adapter;

/**
 * Created by ivan on 15.07.17.
 */
public class Test {

    public static void main(String[] args) {
        PoliceDepartment.accept(new Policeman());
        PoliceDepartment.accept(new PolicemanMilitionerAddapter(new Militioner()));
    }
}
