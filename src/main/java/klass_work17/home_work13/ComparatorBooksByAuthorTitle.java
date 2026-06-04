package klass_work17.home_work13;

import klass_work17.Book;

import java.util.Comparator;

public class ComparatorBooksByAuthorTitle implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        String author1 = o1.getAuthor();
        String author2 = o2.getAuthor();
        if (author1.compareToIgnoreCase(author2) == 0) {
            //return o1.getTitle().compareToIgnoreCase(o2.getTitle()); // первый вариант
            return CharSequence.compare(o1.getTitle(), o2.getTitle()); // второй вариант
        }
        return author1.compareToIgnoreCase(author2); //третий вариант через дополнительные переменные author1 и author2
    }
}
