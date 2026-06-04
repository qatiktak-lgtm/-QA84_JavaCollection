package klass_work17;

import java.util.Comparator;

public class ComparatorBooksByAuthorAZ implements Comparator <Book>{
    @Override
    public int compare(Book b1, Book b2) {
        String author1 = b1.getAuthor();
        String author2 = b2.getAuthor();
        return author1.compareToIgnoreCase(author2);
    }
}
