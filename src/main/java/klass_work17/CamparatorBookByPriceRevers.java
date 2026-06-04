package klass_work17;

import java.util.Comparator;

public class CamparatorBookByPriceRevers implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        Double price1 = b1.getPrice();
        Double price2 = b2.getPrice();
        return Double.compare(price2, price1);
    }
}
