package library;

import java.util.ArrayList;

/**
 * Created by ivan on 23.05.17.
 */
public class Reader extends LibraryRecord {
    private ArrayList<Book> books = new ArrayList<Book>();
    private boolean inDarkList = false;




    public Reader(String name) {
        super(name);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public boolean getisInDarkList() {
        return inDarkList;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void setInDarkList(boolean inDarkList) {
        this.inDarkList = inDarkList;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + getName() + '\'' +
                ", books=" + books +
                ", inDarkList=" + inDarkList +
                '}';
    }


}
