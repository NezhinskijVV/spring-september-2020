package ru.itsjava.proxy;

public class BookDaoImplProxy extends AbstractBookDao implements BookDao{
    private final BookDaoImpl bookDao = new BookDaoImpl();

    @Override
    public String getBook(long id) {
        System.out.println("Begin getBook");
        String res = bookDao.getBook(id);
        System.out.println("End getBook");

        return res;
    }

    @Override
    void print() {
        System.out.println("Begin print");
        bookDao.print();
        System.out.println("End print");
    }
}
