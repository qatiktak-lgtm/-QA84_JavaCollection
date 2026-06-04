package klass_work17;

import java.util.Comparator;

public class ComparatorBooksByAutorReverse implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        String author1 = b1.getAuthor();
        String author2 = b2.getAuthor();
        return author2.compareToIgnoreCase(author1); //reverse
    }
}
