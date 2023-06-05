package RealizeMethods;

import Methods.LibraryService;
import Models.Book;
import Models.DataBase;
import Models.Library;
import Models.Reader;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class LibraryRealise implements LibraryService {
    private DataBase dataBase;

    public LibraryRealise(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }


    @Override
    public void saveLibrary(List<Book>books,List<Reader>readers) {
       dataBase.getLibraries().add(new Library(33L, "Pushkin", "Moskva 128",books,readers));
        System.out.println(dataBase.getLibraries());
    }



    @Override
    public void getAllLibraries() {
            System.out.println(dataBase.getLibraries());
    }

    @Override
    public void getLibraryById(Long id) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (id.equals(dataBase.getLibraries().get(i).getId())){
                System.out.println(dataBase.getLibraries().get(i));
            }

        }

    }

    @Override
    public void updateLibrary(Long id) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (id.equals(dataBase.getLibraries().get(i).getId())){
                dataBase.getLibraries().get(i).setName("Jany At");
                dataBase.getLibraries().get(i).setAdress("Jany Adress");
                System.out.println(dataBase.getLibraries().get(i));}
        }}

    @Override
    public void deleteLibrary(Long id) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (id.equals(dataBase.getLibraries().get(i).getId())){
                dataBase.getLibraries().remove(i);
                System.out.println(dataBase.getLibraries());
            }

        }

    }
}
