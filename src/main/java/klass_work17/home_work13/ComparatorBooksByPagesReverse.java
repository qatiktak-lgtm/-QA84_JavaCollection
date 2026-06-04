package klass_work17.home_work13;

import klass_work17.Book;

import java.util.Comparator;

public class ComparatorBooksByPagesReverse implements Comparator<Book> {

    @Override
    public int compare(Book bk1, Book bk2) {
        int pages1 = bk1.getPages();
        int pages2 = bk2.getPages();
        return pages2 - pages1;

    }
}
