package library;

import java.util.ArrayList;

/**
 * Created by ivan on 23.05.17.
 */
public class Library implements LibraryBL {

    private ArrayList<Reader> registerReaders = new ArrayList<Reader>();
    private ArrayList<Book> booksInLibrary = new ArrayList<Book>();
    private ArrayList<Book> booksInReaders = new ArrayList<Book>();


    public ArrayList<Reader> showReaders() {
        return registerReaders;
    }

    public ArrayList<Book> showBookInLibrary() {
        return booksInLibrary;
    }

    public boolean addBookInLibrary(Book book) {
       return booksInLibrary.add(book);

    }

    public boolean addReaderInReadersList(Reader reader) {

        return registerReaders.add(reader);
    }

    public boolean getBookToReader(Reader reader, Book book) {
if (reader.getBooks().size()<=3 && !reader.getisInDarkList())
        return (reader.getBooks().add(book) && booksInLibrary.remove(book) &&
                booksInReaders.add(book));
 else return false;
    }

    public ArrayList<Book> showBooksInAllReaders() {
        return booksInReaders;
    }

    public ArrayList<Book> showBooksInReader(Reader reader) {
        return reader.getBooks();
    }

    public boolean addReaderToBleakList(Reader reader) {
        reader.setInDarkList(true);
        return reader.getisInDarkList();
    }

    public ArrayList<Book> showBooksByAuthor(Author author) {
        ArrayList<Book> booksByAuthor = new ArrayList<Book>();
        for (int i = 0; i < booksInLibrary.size(); i++) {
            if (booksInLibrary.get(i).getAuthor().equals(author)){
                booksByAuthor.add(booksInLibrary.get(i));
            }
        }
        return booksByAuthor;
    }

    public ArrayList<Book> showBooksByYear(String year) {
        ArrayList<Book> booksByYear = new ArrayList<Book>();
        for (int i = 0; i < booksInLibrary.size(); i++) {
            if (booksInLibrary.get(i).getYear().equals(year)){
                booksByYear.add(booksInLibrary.get(i));
            }
        }
        return booksByYear;
    }

    public boolean returnBookToLibrary(Book book, Reader reader) {
        if (reader.getBooks().contains(book)){
            return booksInLibrary.add(book) && booksInReaders.remove(book) && reader.getBooks().remove(book);
        }
        return false;
    }

   /* private int getIdByRec(LibraryRecord record){
        return record.getId();
    }

    private Book getBookById(int id, ArrayList<Book> list) {
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).getId() == id);
            return list.get(i);
        }
        return null;

    }
*/

}
