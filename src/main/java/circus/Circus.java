package circus;

/**
 * Created by ivan on 16.06.17.
 */
public class Circus {

    private Place place;

    private static Circus uniqueCircus;

    private Circus(Place place){
        this.place = place;
    }


    public static Circus getUniqueCircus(Place p){
        if (uniqueCircus == null){
            uniqueCircus = new Circus(p);
        }
        return uniqueCircus;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circus{");
        sb.append("place=").append(place);
        sb.append('}');
        return sb.toString();
    }
}
