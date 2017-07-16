package circus;

/**
 * Created by ivan on 16.06.17.
 */
public class TestDriveCircus {

    public static void main(String[] args) {
        Place place = new Place("KPI");
        Circus circus = Circus.getUniqueCircus(place);

        Director director = new Director(circus);

        director.addArtist(new Acrobat("vasia1", 0));
        director.addArtist(new Acrobat("vasia2", 0));
        director.addArtist(new Acrobat("vasia31", 0));
        director.addArtist(new Ropewalker("Tolia", 0));
        System.out.println(director.arrToString(director.showAllArtists()));
        System.out.println(director.getMostDrinkerAcrobat());
        System.out.println();
        director.releaseMostDrinkerAcrobat(director.getMostDrinkerAcrobat());
        System.out.println(director.arrToString(director.showAllArtists()));
        director.pleadgeToWorkSomeone(director.showAllArtists().get(0));
        director.pleadgeToWorkSomeone(director.showAllArtists().get(0));
        director.pleadgeToWorkSomeone(director.showAllArtists().get(1));
        director.pleadgeToWorkSomeone(director.showAllArtists().get(2));
        System.out.println(director.getOfPerformances(director.showAllArtists().get(0)));
        director.payWages(320);
        System.out.println(director.arrToString(director.showAllArtists()));
        System.out.println(director.getCircus().getPlace());
        director.changePlace(new Place("uhakova 111"));
        System.out.println(director.getCircus().getPlace());
    }

}
