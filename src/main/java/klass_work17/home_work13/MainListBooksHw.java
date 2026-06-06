package klass_work17.home_work13;

import klass_work17.Book;

import java.util.LinkedList;

public class MainListBooksHw {
    public static void main(String[] args) {
        LinkedList<Book> listHw13 = new LinkedList<>();

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
        Book b11 = new Book("George Orwell", "Keep the Aspidistra Flying", 100, 77.99);
        Book b12 = new Book("George Orwell", "Animal Farm", 98, 5.99);

        listHw13.add(b1);
        listHw13.add(b2);
        listHw13.add(b3);
        listHw13.add(b4);
        listHw13.add(b5);
        listHw13.add(b6);
        listHw13.add(b7);
        listHw13.add(b8);
        listHw13.add(b9);
        listHw13.add(b10);
        listHw13.add(b11);
        listHw13.add(b12);

        System.out.println("Unsorted list of books");
        System.out.println("_".repeat(70));
        printHwBookLists(listHw13);

        System.out.println("Sort Books By Pages Reverse (100->0)");
        System.out.println("_".repeat(70));
        ComparatorBooksByPagesReverse compHw1 = new ComparatorBooksByPagesReverse();
        listHw13.sort(compHw1);
        printHwBookLists(listHw13);

        System.out.println("Sort Books By Price (0.0 -> 100.0)");
        System.out.println("_".repeat(70));
        ComparatorBooksByPrice compHw2 = new ComparatorBooksByPrice();
        listHw13.sort(compHw2);
        printHwBookLists(listHw13);

        System.out.println("Sort Books by Titles (A-Z)");
        System.out.println("_".repeat(70));
        ComparatorBooksByTitle compHw3 = new ComparatorBooksByTitle();
        listHw13.sort(compHw3);
        printHwBookLists(listHw13);

        System.out.println("Sort Books by Title Reverse (Z-A)");
        System.out.println("_".repeat(70));
        ComparatorBooksByTitleReverse compHw4 = new ComparatorBooksByTitleReverse();
        listHw13.sort(compHw4);
        printHwBookLists(listHw13);

        System.out.println("Sort Books by Author & Title");
        System.out.println("_".repeat(70));
        ComparatorBooksByAuthorTitle compHw5 = new ComparatorBooksByAuthorTitle();
        listHw13.sort(compHw5);
        printHwBookLists(listHw13);

    }

    private static void printHwBookLists(LinkedList<Book> listHw13) {
        for (Book bk: listHw13){
            System.out.println(bk);
        }
        System.out.println("*".repeat(50));
        System.out.println();
    }
}
