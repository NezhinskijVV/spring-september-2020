package ru.itsjava.proxy;

public class BookDaoImpl extends AbstractBookDao implements BookDao{

    @Override
    public String getBook(long id) {
        return "Book with id " + id;
    }

    @Override
    void print() {
        System.out.println("Print BookDaoImpl");
    }
}
