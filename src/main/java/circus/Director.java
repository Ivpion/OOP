package circus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivan on 16.06.17.
 */
public class Director implements IDirector {

    private List<Artist> artists = new ArrayList<Artist>();
    private Circus circus;

    public Director(Circus circus) {
        this.circus = circus;
    }


    public Circus getCircus() {
        return circus;
    }

    public List<Artist> showAllArtists() {
        return artists;
    }

    public boolean addArtist(Artist artist) {
        return artists.add(artist);
    }

    public boolean releaseMostDrinkerAcrobat(Acrobat acrobat) {
        return artists.remove(acrobat);
    }

    public void pleadgeToWorkSomeone(Artist artist) {
        artist.showPerformance();
        artist.setPerCount(artist.getPerCount() + 1);
    }

    public int getOfPerformances(Artist artist) {
        return artist.getPerCount();
    }

    public void payWages(double salary) {
        for (Artist artist : artists) {
            artist.setSalary(salary);
        }
    }

    public Place changePlace(Place newPlace) {
        circus.setPlace(newPlace);
        return circus.getPlace();
    }

    public String arrToString(List list) {
        String strList = "";
        for (int i = 0; i < list.size(); i++) {
            strList += list.get(i).toString() + "\n";
        }
        return strList;
    }

    public Acrobat getMostDrinkerAcrobat() {
        List<Acrobat> acrobats = getAcrobatsList();
        Acrobat mostDrink = acrobats.get(0);
        for (Acrobat acrobat : acrobats) {
            if (acrobat.getPromille() > mostDrink.getPromille()) {
                mostDrink = acrobat;
            }
        }
        return mostDrink;
    }

    private List<Acrobat> getAcrobatsList() {
        List<Acrobat> acrobats = new ArrayList<Acrobat>();
        for (Artist acrobat : artists) {
            if (acrobat instanceof Acrobat) {
                acrobats.add((Acrobat) acrobat);
            }
        }
        return acrobats;
    }
}
