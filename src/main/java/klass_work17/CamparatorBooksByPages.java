package klass_work17;

import java.util.Comparator;

public class CamparatorBooksByPages implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        int pages1 = b1.getPages();
        int pages2 = b2.getPages();
        //return pages1-pages2;
        return Integer.compare(pages1, pages2);
    }
}
