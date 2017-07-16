package library;


import java.util.ArrayList;

/**
 * Created by ivan on 23.05.17.
 */
public interface LibraryBL {

    public ArrayList<Reader> showReaders();

    public ArrayList<Book> showBookInLibrary();

    public boolean addBookInLibrary(Book book);

    public boolean addReaderInReadersList(Reader reader);

    public boolean getBookToReader(Reader reader, Book book);

    public ArrayList<Book> showBooksInAllReaders();

    public ArrayList<Book> showBooksInReader(Reader reader);

    public boolean addReaderToBleakList(Reader reader);

    public ArrayList<Book> showBooksByAuthor(Author author);

    public ArrayList<Book> showBooksByYear(String year);

    boolean returnBookToLibrary(Book book, Reader reader);




}
