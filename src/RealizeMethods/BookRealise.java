package RealizeMethods;
import Methods.BookService;
import Models.Book;
import Models.DataBase;
import Models.Library;
import java.util.List;
import java.util.Objects;

public class BookRealise implements BookService {
   private DataBase dataBase;

    public BookRealise(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public Book saveBook(Long libraryId, Book book) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
           if (Objects.equals(libraryId, dataBase.getLibraries().get(i).getId())){
               dataBase.getLibraries().get(i).getBooks().add(book);
           }
        }
        return book;
    }

    @Override
    public void getAllBooks(Long libraryId) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (libraryId.equals(dataBase.getLibraries().get(i).getId())){
                System.out.println(dataBase.getLibraries().get(i).getBooks());}
        }}


    @Override
    public void getBookById(Long libraryId, Long bookId) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (libraryId.equals(dataBase.getLibraries().get(i).getId())){
                for (int j = 0; j < dataBase.getLibraries().get(i).getBooks().size(); j++) {
                    if (bookId.equals(dataBase.getLibraries().get(i).getBooks().get(j).getId())){
                        System.out.println(dataBase.getBooks().get(j));}
                }}}}

    @Override
    public void deleteBook(Long libraryId, Long bookId) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (libraryId.equals(dataBase.getLibraries().get(i).getId())){
                for (int j = 0; j < dataBase.getLibraries().get(i).getBooks().size(); j++) {
                    if (bookId.equals(dataBase.getLibraries().get(i).getBooks().get(j).getId())){
                        dataBase.getLibraries().get(i).getBooks().remove(j);
                        System.out.println(dataBase.getLibraries().get(i).getName()+" kitepkanasynan "+
                                dataBase.getLibraries().get(i).getBooks().get(j)+" ochuruldu");
                        System.out.println(dataBase.getLibraries().get(i).getBooks());}

                }}}}

    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (libraryId.equals(dataBase.getLibraries().get(i).getId())){
                dataBase.getLibraries().get(i).getBooks().clear();
                System.out.println(dataBase.getLibraries().get(i).getBooks());
            }

        }

    }
}