package klass_work17.home_work13;

import klass_work17.Book;

import java.util.Comparator;

public class ComparatorBooksByPrice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        double priceHw1 = o1.getPrice();
        double priceHw2 = o2.getPrice();
        return Double.compare(priceHw1, priceHw2);
    }
}
