import Enums.Gender;
import Enums.Genre;
import Methods.BookService;
import Models.Book;
import Models.DataBase;
import Models.Library;
import Models.Reader;
import RealizeMethods.BookRealise;
import RealizeMethods.LibraryRealise;
import RealizeMethods.ReaderRealise;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Book book1=new Book(11L,"Jamila","Aitmatov", Genre.DRAMA);
        Book book2=new Book(12L,"Bogatyi papa","Robert Kiyosaki", Genre.POEZIYA);
        Book book3=new Book(13L,"Voina i Mir","Lev Tolstoi", Genre.POVEST);
        Book book4=new Book(14L,"Uliss","Djaims Djois", Genre.EPOS);
        Book book5=new Book(15L,"Vinni-Puh","Alan Miln", Genre.DRAMA);
        Book book6=new Book(16L,"Istoriya","Fukidid", Genre.EPOS);
        Book book7=new Book(17L,"Kapital","Carl MArks", Genre.POEZIYA);
        Book book8=new Book(18L,"Rodnoi Syn","Richard Rait", Genre.DRAMA);
        List<Book>books=new ArrayList<>(List.of(book1,book2,book3,book4,book5,book6,book7,book8));
        List<Book>books1=new ArrayList<>(List.of(book1,book2,book3,book4,book5));
        List<Book>books2=new ArrayList<>(List.of(book6,book7,book8));


        Reader reader1=new Reader(21L,"Abu","qwerty@gmail.com","+996555555555", Gender.MALE);
        Reader reader2=new Reader(22L,"Kanzhar","asdfg@gmail.com","+996777777777", Gender.MALE);
        Reader reader3=new Reader(23L,"Dany","zxcv@gmail.com","+996999999999", Gender.MALE);
        Reader reader4=new Reader(24L,"Liz","qazwsx@gmail.com","+996222222222", Gender.FEMALE);
        List<Reader>readers=new ArrayList<>(List.of(reader1,reader2,reader3,reader4));
        List<Reader>readers1=new ArrayList<>(List.of(reader1,reader2));
        List<Reader>readers2=new ArrayList<>(List.of(reader3,reader4));


        Library library1=new Library(31L,"Bayalinov","Chui 127",books1,readers1);
        Library library2=new Library(32L,"Aitmatov","Manas 100",books2,readers2);
        List<Library>libraries=new ArrayList<>(List.of(library1,library2));


        DataBase dataBase=new DataBase(books,libraries,readers);

        BookRealise bookRealise=new BookRealise(dataBase);
        System.out.println(bookRealise.saveBook(31L, book1));
       bookRealise.getBookById(31L, 15L);
        bookRealise.deleteBook(32L,18L);
        bookRealise.clearBooksByLibraryId(31L);
        bookRealise.getAllBooks(31L);


        LibraryRealise libraryRealise=new LibraryRealise(dataBase);
        libraryRealise.saveLibrary(books2,readers2);
        System.out.println("============================================");
        libraryRealise.getAllLibraries();
        System.out.println("===========================================");
        libraryRealise.getLibraryById(32L);
        libraryRealise.updateLibrary(31L);
        libraryRealise.deleteLibrary(31L);


        ReaderRealise readerRealise=new ReaderRealise(dataBase);
        readerRealise.saveReader();
        readerRealise.getAllReaders();
        readerRealise.getReaderById(21L);
        readerRealise.updateReader(23L);
        readerRealise.assignReaderToLibrary(21L,32L);





    }
}