package klass_work17;
//2023-06-03
import java.util.LinkedList;

public class MainListBooks {
    public static void main(String[] args) {
        LinkedList<Book> list = new LinkedList<>();

        Book b1 = new Book("George Orwell", "1984", 328, 14.99);
        Book b2 = new Book("Harper Lee", "To Kill a Mockingbird", 281, 12.50);
        Book b3 = new Book("J.R.R. Tolkien", "The Hobbit", 310, 18.75);
        Book b4 = new Book("F. Scott Fitzgerald", "The Great Gatsby", 180, 10.99);
        Book b5 = new Book("Jane Austen", "Pride and Prejudice", 432, 15.25);
        Book b6 = new Book("Mark Twain", "Adventures of Huckleberry Finn", 366, 13.49);
        Book b7 = new Book("Mary Shelley", "Frankenstein", 280, 11.99);
        Book b8 = new Book("Bram Stoker", "Draeula", 418, 16.50);
        Book b9 = new Book("Herman Melville", "Moby-Dick", 635, 19.99);
        Book b10 = new Book("Leo Tolstoy", "War and Peace", 1225, 24.99);

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        list.add(b6);
        list.add(b7);
        list.add(b8);
        list.add(b9);
        list.add(b10);

        printBookLists(list);

        list.sort( null);
        printBookLists(list);

        ComparatorBooksByAutorReverse comp1 = new ComparatorBooksByAutorReverse();
        list.sort(comp1);
        printBookLists(list);

        ComparatorBooksByAuthorAZ comp2 = new ComparatorBooksByAuthorAZ();
        list.sort(comp2);
        printBookLists(list);

        CamparatorBooksByPages comp3 = new CamparatorBooksByPages();
        list.sort(comp3);
        printBookLists(list);

        CamparatorBookByPriceRevers comp4 = new CamparatorBookByPriceRevers();
        list.sort(comp4);
        printBookLists(list);


        }

    private static void printBookLists(LinkedList<Book> list) {
        for (Book b : list) {
                System.out.println(b);
            }
            System.out.println("*".repeat(50));
    }
}

