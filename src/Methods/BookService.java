package Methods;

import Models.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Long libraryId, Book book);
    void getAllBooks(Long libraryId);
    void getBookById(Long libraryId, Long bookId);
    void deleteBook(Long libraryId,Long bookId);
    void clearBooksByLibraryId(Long libraryId);
}
