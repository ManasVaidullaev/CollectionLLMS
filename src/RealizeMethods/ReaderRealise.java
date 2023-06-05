package RealizeMethods;

import Enums.Gender;
import Methods.ReaderService;
import Models.DataBase;
import Models.Library;
import Models.Reader;

import java.util.List;

public class ReaderRealise implements ReaderService {
    private DataBase dataBase;

    public ReaderRealise(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void saveReader() {
        dataBase.getReaders().add(new Reader(25L,"Masha","mnmnmn@gmailcom","+996505251436",Gender.FEMALE));
        System.out.println(dataBase.getReaders());

    }

    @Override
    public void getAllReaders() {
        System.out.println(dataBase.getReaders());
    }

    @Override
    public void getReaderById(Long id) {
        for (int i = 0; i < dataBase.getReaders().size(); i++) {
            if (id.equals(dataBase.getReaders().get(i).getId())){
                System.out.println(dataBase.getReaders().get(i));}
        }}

    @Override
    public void updateReader(Long id) {
        for (int i = 0; i < dataBase.getReaders().size(); i++) {
            if (id.equals(dataBase.getReaders().get(i).getId())){
                dataBase.getReaders().get(i).setFullName("Novoe imya");
                dataBase.getReaders().get(i).setEmail("Novyi email");
                dataBase.getReaders().get(i).setGender(Gender.MALE);}
            System.out.println(dataBase.getReaders().get(i));
        }}

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
        for (int i = 0; i < dataBase.getReaders().size(); i++) {
            if (readerId.equals(dataBase.getReaders().get(i).getId())){
                for (int j = 0; j < dataBase.getLibraries().size(); j++) {
                    if (libraryId.equals(dataBase.getLibraries().get(j).getId())){
                        dataBase.getLibraries().get(j).getReaders().add(dataBase.getReaders().get(i));
                        System.out.println(dataBase.getLibraries().get(j));}
                }}}}
}
