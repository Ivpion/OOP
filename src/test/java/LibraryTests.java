import library.Author;
import library.Book;
import library.Reader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ivan on 23.05.17.
 */
public class LibraryTests {
    Author author;
    Reader reader;
    Book book;

    @Before
    public void init() {
        author = new Author("ivan");
        reader = new Reader("Dima");
        book = new Book("Life", author, "2003");
    }


    @Test
    public void idTest() throws Exception {
        Assert.assertEquals(author.getId(),1);
        Assert.assertEquals(reader.getId(),2);
    }


}
