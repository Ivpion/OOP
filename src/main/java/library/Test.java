package library;


/**
 * Created by ivan on 23.05.17.
 */
public class Test {
    public static void main(String[] args) {
        Author author = new Author("Ivan");
        Book book = new Book("Life", author, "2012");
        Book book1 = new Book("Death", author, "1995");
        Reader reader = new Reader("Dima");
        LibraryBL library = new Library();

        library.addReaderInReadersList(reader);
        library.addBookInLibrary(book);
        library.addBookInLibrary(book1);
        System.out.println(library.showBookInLibrary().toString());
        //library.addReaderToBleakList(reader);
        library.getBookToReader(reader, book);
        System.out.println(library.showReaders().toString());
        System.out.println(library.showBookInLibrary().toString());
        System.out.println(library.showBooksInAllReaders().toString());
        System.out.println(library.showBooksByAuthor(author));
        System.out.println(library.showBooksByYear("2012"));
        System.out.println(library.showBooksInReader(reader));
        library.returnBookToLibrary(book, reader);
        System.out.println(library.showBookInLibrary().toString());
        System.out.println(library.showBooksInAllReaders().toString());
        System.out.println(library.showBooksInReader(reader));
    }
}
