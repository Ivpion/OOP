package circus;

import java.util.List;

/**
 * Created by ivan on 15.06.17.
 */
public interface IDirector  {

    List showAllArtists();

    boolean addArtist(Artist artist);

    boolean releaseMostDrinkerAcrobat(Acrobat acrobat);

    void pleadgeToWorkSomeone(Artist artist);

    int getOfPerformances(Artist artist);

    void payWages(double salary);

    Place changePlace(Place newPlace);

    public String arrToString(List list);

}
