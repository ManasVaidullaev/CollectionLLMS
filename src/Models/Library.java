package Models;

import java.util.List;

public class Library {
    private Long id;
    private String name;
    private String adress;
    private List<Book>books;
    private List<Reader>readers;

    public Library(Long id, String name, String adress, List<Book> books, List<Reader> readers) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.books = books;
        this.readers = readers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    @Override
    public String toString() {
        return "\nLibrary{" +
                "\nid=" + id +
                "\name='" + name + '\'' +
                "\nadress='" + adress + '\'' +
                "\nbooks=" + books +
                "\nreaders=" + readers +
                '}';
    }
}
