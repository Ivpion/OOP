package library;



/**
 * Created by ivan on 23.05.17.
 */
public class Book  extends LibraryRecord{

    private Author author;
    private String year;

    public Book(String name, Author author, String year) {
        super(name);
        this.author = author;
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", name='" + getName() + '\'' +
                ", year='" + year + '\'' +
                '}';
    }


}
