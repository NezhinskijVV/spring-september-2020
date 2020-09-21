package ru.itsjava.proxy;

public class Main {

    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImplProxy();
        bookDao.getBook(5L);
//        System.out.println("bookDao.getBook(5L) = " + bookDao.getBook(5L));
    }
}
