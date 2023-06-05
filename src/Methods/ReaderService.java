package Methods;

import Models.Reader;

import java.util.List;

public interface ReaderService {
    void saveReader();
    void getAllReaders();
  void getReaderById(Long id);
   void updateReader(Long id);
    void assignReaderToLibrary(Long readerId,Long libraryId);
}
