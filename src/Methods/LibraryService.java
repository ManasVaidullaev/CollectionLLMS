package Methods;

import Models.Book;
import Models.Library;
import Models.Reader;

import java.util.List;

public interface LibraryService {
    void saveLibrary(List<Book>books, List<Reader>readers);
    void getAllLibraries();
    void getLibraryById(Long id);
   void updateLibrary(Long id);
    void deleteLibrary(Long id);
}
