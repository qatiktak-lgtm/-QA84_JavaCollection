package klass_work17.home_work13;

import klass_work17.Book;

import java.util.Comparator;

public class ComparatorBooksByTitle implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        String title1 = o1.getTitle();
        String title2 = o2.getTitle();
        return title1.compareToIgnoreCase(title2);
    }
}
