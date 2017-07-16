package library;

/**
 * Created by ivan on 23.05.17.
 */
public abstract class LibraryRecord {

    private static int idcount = 1;
    private int id;
    private String name;


    public LibraryRecord(String name) {
        this.name = name;
        id = idcount++;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "name = " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryRecord that = (LibraryRecord) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
