package h_w_12L16;

import java.util.LinkedList;
import java.util.List;

public class hw_12MainBooks {
    public static void main(String[] args) {
        LinkedList<Books> books1 = new LinkedList<>(
                List.of(
                        new Books("Isaac Asimov", "Foundation", 255, 12.99),
                        new Books("Arthur C. Clarke", "2001: A Space Odyssey", 297, 14.50),
                        new Books("Robert A. Heinlein", "Stranger in a Strange Land", 438, 15.99),
                        new Books("Philip K. Dick", "Do Androids Dream of Electric Sheep?", 210, 10.99),
                        new Books("Frank Herbert", "Dune", 688, 18.99),
                        new Books("Ursula K. Le Guin", "The Left Hand of Darkness", 304, 13.49),
                        new Books("Ray Bradbury", "Fahrenheit 451", 194, 9.99),
                        new Books("H. G. Wells", "The Time Machine", 118, 8.99),
                        new Books("Stanisław Lem", "Solaris", 224, 15.25),
                        new Books("William Gibson", "Neuromancer", 271, 12.50)
                )
        );
        System.out.println("=".repeat(80));
        printBooksList(books1);
        System.out.println("=".repeat(80));
    }

    private static void printBooksList(LinkedList<Books> books1) {
        for (Books book : books1) {
            System.out.println(book);  // или короче books1.forEach(System.out::println);
        }
    }
}
